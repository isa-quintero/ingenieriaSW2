package academic.service.facade.attendance.implementation;


import org.springframework.transaction.annotation.Transaccional;

import academic.domain.AttendanceDomain;
import academic.dto.AttendanceDTO;
import academic.service.facade.attendance.RegisterAttendanceFacade;
import academic.service.usecase.attendance.RegisterAttendance;

@Service
@Transaccional
public class RegisterAttendanceFacadeImpl implements RegisterAttendanceFacade{

	@Autowired
	private RegisterAttendance registerAttendance;
	
	@Override
	public void execute(AttendanceDTO dto) {
		AttendanceDomain domain = null;
		registerAttendance.execute(null);
		
	}

}
