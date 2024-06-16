import org.junit.Test;

import static com.heima.utils.common.AppJwtUtil.getToken;

public class test {


    @Test
    public static void main(String[] args) {

        String jwt = getToken(12345L);
        System.out.println(jwt);
    }
}
