package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;


public class StringTest {

    @Test
    void split1(){

        final String[] actual = "1,2".split(",");
        assertThat(actual).containsExactly("1");

    }

    @DisplayName("특정위치의 문자를 가져올때 위치값을 벗어나면 StringIndexOutOfBoundsException 이 발생한다")
    @Test
    void charAt2(){
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(()-> "abc".charAt(5))
                .withMessageMatching("Index: \\d+, Size: \\d+");
    }

    @Test
    void split3(){

        String actual = "abc";

        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {"abc".charAt(3);})
                .withMessage("String index out of range: %s", "3")
                .withMessageContaining("index out of")
                .withNoCause();

        //System.out.println(actual.substring(1, 2));

    }
}
