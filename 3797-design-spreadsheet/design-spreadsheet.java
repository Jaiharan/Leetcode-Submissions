class Spreadsheet {

    private Map<String, Integer> sheet;
    
    public Spreadsheet(int rows) {
        sheet = new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
        sheet.put(cell, value);
    }
    
    public void resetCell(String cell) {
        sheet.remove(cell);
    }
    
    public int getValue(String formula) {
        if(!formula.startsWith("=")) {
            return Integer.parseInt(formula);
        }

        String[] parts = formula.substring(1).split("\\+");
        return getOperandValue(parts[0]) + getOperandValue(parts[1]);
    }

    private int getOperandValue(String operand) {
        if (Character.isLetter(operand.charAt(0))) {
            return sheet.getOrDefault(operand, 0);
        }
        return Integer.parseInt(operand);
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */