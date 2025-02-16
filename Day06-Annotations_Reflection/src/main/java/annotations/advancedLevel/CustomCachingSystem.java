package annotations.advancedLevel;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;


    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface CacheResult {
    }

    class ExpensiveComputation {
        private static Map<String, Integer> cache = new HashMap<>();

        @CacheResult
        public int compute(int x) {
            String key = "compute-" + x;
            if (cache.containsKey(key)) {
                return cache.get(key);
            }
            int result = x * x;
            cache.put(key, result);
            return result;
        }
    }

public class CustomCachingSystem {
        public static void main(String[] args) throws Exception {
            ExpensiveComputation computation = new ExpensiveComputation();
            Method method = computation.getClass().getMethod("compute", int.class);

            System.out.println(method.invoke(computation, 5));
            System.out.println(method.invoke(computation, 5));
            System.out.println(method.invoke(computation, 10));
        }
    }

