package client;

public class Position {
    private int row;
    private int col;

    public Position(int col, int row) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public String toString() {
        return "x: " + col + ", y: " + row;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.row == position.getRow() && this.col == position.getCol();
    }

    @Override
    public int hashCode() {
        return this.row + this.col;
    }
}
