public enum MultiplyOperation {
    ADD {
        @Override
        public double multiply(int a, int b) {
            return a + b;
        }
    };

    public abstract double multiply(int a, int b);
}
