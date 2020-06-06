package vl.table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result<X, Y> {
    private final X x;
    private final Y y;
    private final Double value;
    private final String name;

    public static <X, Y> Result<X, Y> empty() {
        return Result.<X, Y>builder().build();
    }

    public boolean isEmpty() {
        return value == null;
    }
}
