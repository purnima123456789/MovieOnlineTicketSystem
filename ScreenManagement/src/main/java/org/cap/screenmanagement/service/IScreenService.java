package org.cap.screenmanagement.service;

import java.util.List;
import org.cap.screenmanagement.entities.Screen;

public interface IScreenService {

	Screen addScreen(Screen screen);

	Boolean deleteScreen(int screenId);

	Screen viewScreen(int screenId);

	List<Screen> viewAllScreens();
}
