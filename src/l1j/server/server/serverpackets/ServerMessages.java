package l1j.server.server.serverpackets;

/**
 * Cache of common server messages. TODO: HotSpot has been optimized for short
 * life objects so it's possible this doesn't make a difference. Need hard
 * numbers.
 */
public class ServerMessages {
	// TODO: Short descriptive names.
	public static final S_ServerMessage Cant = new S_ServerMessage(79);
	/*
	 * public static final S_ServerMessage M64 = new S_ServerMessage(64); public
	 * static final S_ServerMessage M75 = new S_ServerMessage(75); public static
	 * final S_ServerMessage M76 = new S_ServerMessage(76); public static final
	 * S_ServerMessage M77 = new S_ServerMessage(77); public static final
	 * S_ServerMessage M82 = new S_ServerMessage(82); public static final
	 * S_ServerMessage M85 = new S_ServerMessage(85); public static final
	 * S_ServerMessage M86 = new S_ServerMessage(86); public static final
	 * S_ServerMessage M89 = new S_ServerMessage(89); public static final
	 * S_ServerMessage M93 = new S_ServerMessage(93); // no one there? public
	 * static final S_ServerMessage M99 = new S_ServerMessage(99); public static
	 * final S_ServerMessage M109 = new S_ServerMessage(109); public static
	 * final S_ServerMessage M110 = new S_ServerMessage(110); public static
	 * final S_ServerMessage M124 = new S_ServerMessage(124); public static
	 * final S_ServerMessage M125 = new S_ServerMessage(125); public static
	 * final S_ServerMessage M127 = new S_ServerMessage(127); public static
	 * final S_ServerMessage M128 = new S_ServerMessage(128); public static
	 * final S_ServerMessage M129 = new S_ServerMessage(129); public static
	 * final S_ServerMessage M141 = new S_ServerMessage(141); public static
	 * final S_ServerMessage M150 = new S_ServerMessage(150); public static
	 * final S_ServerMessage M153 = new S_ServerMessage(153); public static
	 * final S_ServerMessage M154 = new S_ServerMessage(154); public static
	 * final S_ServerMessage M155 = new S_ServerMessage(155); public static
	 * final S_ServerMessage M181 = new S_ServerMessage(181); public static
	 * final S_ServerMessage M183 = new S_ServerMessage(183); public static
	 * final S_ServerMessage M189 = new S_ServerMessage(189); public static
	 * final S_ServerMessage M196 = new S_ServerMessage(196); public static
	 * final S_ServerMessage M197 = new S_ServerMessage(197); public static
	 * final S_ServerMessage M198 = new S_ServerMessage(198); public static
	 * final S_ServerMessage M199 = new S_ServerMessage(199); public static
	 * final S_ServerMessage M200 = new S_ServerMessage(200); public static
	 * final S_ServerMessage M204 = new S_ServerMessage(204); public static
	 * final S_ServerMessage M208 = new S_ServerMessage(208); public static
	 * final S_ServerMessage M209 = new S_ServerMessage(209); public static
	 * final S_ServerMessage M212 = new S_ServerMessage(212); public static
	 * final S_ServerMessage M214 = new S_ServerMessage(214); // can't bookmark
	 * here public static final S_ServerMessage M230 = new S_ServerMessage(230);
	 * public static final S_ServerMessage M232 = new S_ServerMessage(232);
	 * public static final S_ServerMessage M234 = new S_ServerMessage(234);
	 * public static final S_ServerMessage M242 = new S_ServerMessage(242);
	 * public static final S_ServerMessage M263 = new S_ServerMessage(263); //
	 * full inventory public static final S_ServerMessage M264 = new
	 * S_ServerMessage(264); public static final S_ServerMessage M270 = new
	 * S_ServerMessage(270); public static final S_ServerMessage M271 = new
	 * S_ServerMessage(271); public static final S_ServerMessage M272 = new
	 * S_ServerMessage(272); public static final S_ServerMessage M276 = new
	 * S_ServerMessage(276); public static final S_ServerMessage M278 = new
	 * S_ServerMessage(278); public static final S_ServerMessage M279 = new
	 * S_ServerMessage(279); public static final S_ServerMessage M280 = new
	 * S_ServerMessage(280); public static final S_ServerMessage M281 = new
	 * S_ServerMessage(281); public static final S_ServerMessage M285 = new
	 * S_ServerMessage(285); public static final S_ServerMessage M288 = new
	 * S_ServerMessage(288); public static final S_ServerMessage M297 = new
	 * S_ServerMessage(297); public static final S_ServerMessage M299 = new
	 * S_ServerMessage(299); public static final S_ServerMessage M302 = new
	 * S_ServerMessage(302); public static final S_ServerMessage M312 = new
	 * S_ServerMessage(312); public static final S_ServerMessage M316 = new
	 * S_ServerMessage(316); public static final S_ServerMessage M319 = new
	 * S_ServerMessage(319); public static final S_ServerMessage M324 = new
	 * S_ServerMessage(324); public static final S_ServerMessage M326 = new
	 * S_ServerMessage(326); public static final S_ServerMessage M327 = new
	 * S_ServerMessage(327); // bm name already exists public static final
	 * S_ServerMessage M337 = new S_ServerMessage(337, "$4"); public static
	 * final S_ServerMessage M357 = new S_ServerMessage(357); public static
	 * final S_ServerMessage M414 = new S_ServerMessage(414); public static
	 * final S_ServerMessage M415 = new S_ServerMessage(415); public static
	 * final S_ServerMessage M416 = new S_ServerMessage(416); public static
	 * final S_ServerMessage M417 = new S_ServerMessage(417); public static
	 * final S_ServerMessage M418 = new S_ServerMessage(418); public static
	 * final S_ServerMessage M419 = new S_ServerMessage(419); public static
	 * final S_ServerMessage M425 = new S_ServerMessage(425); public static
	 * final S_ServerMessage M427 = new S_ServerMessage(427); public static
	 * final S_ServerMessage M428 = new S_ServerMessage(428); public static
	 * final S_ServerMessage M434 = new S_ServerMessage(434); public static
	 * final S_ServerMessage M462 = new S_ServerMessage(462); public static
	 * final S_ServerMessage M472 = new S_ServerMessage(472); public static
	 * final S_ServerMessage M474 = new S_ServerMessage(474); public static
	 * final S_ServerMessage M475 = new S_ServerMessage(475); public static
	 * final S_ServerMessage M476 = new S_ServerMessage(476); public static
	 * final S_ServerMessage M477 = new S_ServerMessage(477); public static
	 * final S_ServerMessage M478 = new S_ServerMessage(478); public static
	 * final S_ServerMessage M481 = new S_ServerMessage(481); public static
	 * final S_ServerMessage M489 = new S_ServerMessage(489); public static
	 * final S_ServerMessage M510 = new S_ServerMessage(510); public static
	 * final S_ServerMessage M513 = new S_ServerMessage(513); public static
	 * final S_ServerMessage M518 = new S_ServerMessage(518); public static
	 * final S_ServerMessage M519 = new S_ServerMessage(519); public static
	 * final S_ServerMessage M521 = new S_ServerMessage(521); public static
	 * final S_ServerMessage M523 = new S_ServerMessage(523); public static
	 * final S_ServerMessage M528 = new S_ServerMessage(528); public static
	 * final S_ServerMessage M546 = new S_ServerMessage(546); public static
	 * final S_ServerMessage M547 = new S_ServerMessage(547); public static
	 * final S_ServerMessage M548 = new S_ServerMessage(548); public static
	 * final S_ServerMessage M549 = new S_ServerMessage(549); public static
	 * final S_ServerMessage M559 = new S_ServerMessage(559); public static
	 * final S_ServerMessage M560 = new S_ServerMessage(560); public static
	 * final S_ServerMessage M563 = new S_ServerMessage(563); public static
	 * final S_ServerMessage M591 = new S_ServerMessage(591); public static
	 * final S_ServerMessage M592 = new S_ServerMessage(592); public static
	 * final S_ServerMessage M623 = new S_ServerMessage(623); public static
	 * final S_ServerMessage M627 = new S_ServerMessage(627); public static
	 * final S_ServerMessage M633 = new S_ServerMessage(633); public static
	 * final S_ServerMessage M634 = new S_ServerMessage(634); public static
	 * final S_ServerMessage M643 = new S_ServerMessage(643); public static
	 * final S_ServerMessage M647 = new S_ServerMessage(647); public static
	 * final S_ServerMessage M657 = new S_ServerMessage(657); public static
	 * final S_ServerMessage M658 = new S_ServerMessage(658); public static
	 * final S_ServerMessage M661 = new S_ServerMessage(661); public static
	 * final S_ServerMessage M662 = new S_ServerMessage(662); public static
	 * final S_ServerMessage M665 = new S_ServerMessage(665); public static
	 * final S_ServerMessage M678 = new S_ServerMessage(678); public static
	 * final S_ServerMessage M697 = new S_ServerMessage(697); public static
	 * final S_ServerMessage M698 = new S_ServerMessage(698); public static
	 * final S_ServerMessage M728 = new S_ServerMessage(728); public static
	 * final S_ServerMessage M739 = new S_ServerMessage(739); public static
	 * final S_ServerMessage M743 = new S_ServerMessage(743); public static
	 * final S_ServerMessage M756 = new S_ServerMessage(756); public static
	 * final S_ServerMessage M757 = new S_ServerMessage(757); public static
	 * final S_ServerMessage M759 = new S_ServerMessage(759); public static
	 * final S_ServerMessage M785 = new S_ServerMessage(785); public static
	 * final S_ServerMessage M790 = new S_ServerMessage(790); public static
	 * final S_ServerMessage M822 = new S_ServerMessage(822); public static
	 * final S_ServerMessage M876 = new S_ServerMessage(876); public static
	 * final S_ServerMessage M905 = new S_ServerMessage(905); public static
	 * final S_ServerMessage M942 = new S_ServerMessage(942); public static
	 * final S_ServerMessage M945 = new S_ServerMessage(945); public static
	 * final S_ServerMessage M966 = new S_ServerMessage(966); public static
	 * final S_ServerMessage M990 = new S_ServerMessage(990); public static
	 * final S_ServerMessage M991 = new S_ServerMessage(991); public static
	 * final S_ServerMessage M1007 = new S_ServerMessage(1007); public static
	 * final S_ServerMessage M1008 = new S_ServerMessage(1008); public static
	 * final S_ServerMessage M1064 = new S_ServerMessage(1064); public static
	 * final S_ServerMessage M1078 = new S_ServerMessage(1078); public static
	 * final S_ServerMessage M1079 = new S_ServerMessage(1079); public static
	 * final S_ServerMessage M1080 = new S_ServerMessage(1080); public static
	 * final S_ServerMessage M1081 = new S_ServerMessage(1081); public static
	 * final S_ServerMessage M1098 = new S_ServerMessage(1098); public static
	 * final S_ServerMessage M1099 = new S_ServerMessage(1099); public static
	 * final S_ServerMessage M1101 = new S_ServerMessage(1101); public static
	 * final S_ServerMessage M1102 = new S_ServerMessage(1102); public static
	 * final S_ServerMessage M1103 = new S_ServerMessage(1103); public static
	 * final S_ServerMessage M1127 = new S_ServerMessage(1127); public static
	 * final S_ServerMessage M1135 = new S_ServerMessage(1135); public static
	 * final S_ServerMessage M1137 = new S_ServerMessage(1137); public static
	 * final S_ServerMessage M1138 = new S_ServerMessage(1138); public static
	 * final S_ServerMessage M1140 = new S_ServerMessage(1140); public static
	 * final S_ServerMessage M1141 = new S_ServerMessage(1141); public static
	 * final S_ServerMessage M1142 = new S_ServerMessage(1142); public static
	 * final S_ServerMessage M1160 = new S_ServerMessage(1160); public static
	 * final S_ServerMessage M1161 = new S_ServerMessage(1161); public static
	 * final S_ServerMessage M1162 = new S_ServerMessage(1162); public static
	 * final S_ServerMessage M1170 = new S_ServerMessage(1170); public static
	 * final S_ServerMessage M1181 = new S_ServerMessage(1181); public static
	 * final S_ServerMessage M1182 = new S_ServerMessage(1182); public static
	 * final S_ServerMessage M1184 = new S_ServerMessage(1184); public static
	 * final S_ServerMessage M1187 = new S_ServerMessage(1187); public static
	 * final S_ServerMessage M1254 = new S_ServerMessage(1254); public static
	 * final S_ServerMessage M1255 = new S_ServerMessage(1255); public static
	 * final S_ServerMessage M1259 = new S_ServerMessage(1259); public static
	 * final S_ServerMessage M1257 = new S_ServerMessage(1257); public static
	 * final S_ServerMessage M1266 = new S_ServerMessage(1266); public static
	 * final S_ServerMessage M1269 = new S_ServerMessage(1269); public static
	 * final S_ServerMessage M1275 = new S_ServerMessage(1275); public static
	 * final S_ServerMessage M1290 = new S_ServerMessage(1290); public static
	 * final S_ServerMessage M1384 = new S_ServerMessage(1384); public static
	 * final S_ServerMessage M1385 = new S_ServerMessage(1385); public static
	 * final S_ServerMessage M1387 = new S_ServerMessage(1387); public static
	 * final S_ServerMessage M1390 = new S_ServerMessage(1390); public static
	 * final S_ServerMessage M1412 = new S_ServerMessage(1412); public static
	 * final S_ServerMessage M1453 = new S_ServerMessage(1453); public static
	 * final S_ServerMessage M1467 = new S_ServerMessage(1467); public static
	 * final S_ServerMessage M1468 = new S_ServerMessage(1468); public static
	 * final S_ServerMessage M1469 = new S_ServerMessage(1469); public static
	 * final S_ServerMessage M1536 = new S_ServerMessage(1536);
	 */
}