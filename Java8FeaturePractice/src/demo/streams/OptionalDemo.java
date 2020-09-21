package demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo {

	public static void main(String[] args) {

		List<User> users = Arrays.asList(new User("ram", 10, Arrays.asList("23","11","33")),
				new User("shyam", 11, Arrays.asList("2","1","3")),
				new User("mohan", 12, Arrays.asList("43","41","45")),
				new User("sohan", 13, Arrays.asList("53","61","63"))
				);

		Optional<Stream<String>> optionalVar = users.stream().map(user -> user.getPhoneNumbers().stream())
                                               .filter(nums -> nums.equals("23"))
                                               .findAny();
	
		
		/**
		 * if value is not present, optional will wrap it and won't allow cursor to go inside below line avoidind NPE
		 */
		optionalVar.ifPresent(System.out :: println);
		
	}
}

/** 1st approach
 * Optional<String> optionalVar = users.stream().map(phoneNumsList -> phoneNumsList.getPhoneNumbers().stream())
		                                    .flatMap(phoneNums -> phoneNums.filter(nums -> nums.equals("237")))
		                                    .findAny();
 */

/** 2nd approach
 * Optional<String> optionalVar = users.stream().map(user -> user.getPhoneNumbers().stream())
                .flatMap(phoneNums -> phoneNums.filter(nums -> nums.equals("23")))
                .findAny();
 */

/**
 * 3rd approach
		String optionalVar = users.stream().map(user -> user.getPhoneNumbers().stream())
                .flatMap(phoneNums -> phoneNums.filter(nums -> nums.equals("232")))
                .findAny().orElse(null);
 */
