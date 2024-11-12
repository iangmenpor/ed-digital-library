package com.iesam.library.features.user.domain;

public class UpdateUserUseCase {

    private final UserRepository userRepository;


    public UpdateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(User user){
        userRepository.updateUser(user);
    }
}
