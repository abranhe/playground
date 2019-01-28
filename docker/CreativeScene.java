// import javafx.stage.*;
// import javafx.scene.Scene;
// import javafx.scene.image.*;
// import javafx.scene.shape.*;
// import javafx.scene.effect.*;
// import javafx.scene.text.Font;
// import javafx.scene.paint.Stop;
// import javafx.scene.layout.Pane;
// import javafx.scene.paint.Color;
// import javafx.scene.control.Label;
// import javafx.application.Application;
// import javafx.scene.paint.CycleMethod;
// import javafx.scene.paint.LinearGradient;


// public class CreativeScene extends Application {

//     @Override
//     public void start(Stage primaryStage) {

//         Pane pane = new Pane();
//         /* Set color of the pane */
//         pane.setStyle("-fx-background-color: #001229;");

//         /* Create Ellipse that represents the planet */
//         Ellipse planet = new Ellipse();
//         planet.setFill(Color.valueOf("#003380"));
//         planet.setLayoutX(533.0);
//         planet.setLayoutY(581.0);
//         planet.setRadiusX(566.0);
//         planet.setRadiusY(302.0);
//         planet.setRotate(-21.0);
//         planet.setStrokeWidth(0.0);

//         /* Add shadow effect to the ellipse created */
//         DropShadow planetShadow = new DropShadow();
//         planetShadow.setColor(Color.valueOf("#003380"));
//         planetShadow.setHeight(247.71);
//         planetShadow.setRadius(125.17750000000001);
//         planetShadow.setSpread(0.77);
//         planetShadow.setWidth(255.0);
//         planet.setEffect(planetShadow);

//         /* Create ellipse that represent a the top-left galaxy */
//         Ellipse galaxy = new Ellipse();
//         galaxy.setFill(Color.valueOf("#1e2e42"));
//         galaxy.setLayoutX(168.0);
//         galaxy.setLayoutY(26.0);
//         galaxy.setRadiusX(204.0);
//         galaxy.setRadiusY(47.0);
//         galaxy.setRotate(-12.5);
//         galaxy.setStrokeWidth(0.0);

//         /* Add shadow effet to the galaxy */
//         DropShadow galaxyShadow = new DropShadow();
//         galaxyShadow.setColor(Color.valueOf("#1e2e42"));
//         galaxyShadow.setHeight(176.55);
//         galaxyShadow.setRadius(43.6375);
//         galaxyShadow.setSpread(0.74);
//         galaxyShadow.setWidth(0.0);
//         galaxy.setEffect(galaxyShadow);

//         /* Create an arc that represents the black hole of the galaxy */
//         Arc blackHole = new Arc();
//         blackHole.setFill(Color.valueOf("#00132b"));
//         blackHole.setLayoutX(112.0);
//         blackHole.setLayoutY(76.0);
//         blackHole.setLength(20.0);
//         blackHole.setOpacity(0.56);
//         blackHole.setRadiusX(240.0);
//         blackHole.setRadiusY(209.0);
//         blackHole.setRotate(9.7);
//         blackHole.setStartAngle(26.6);
//         blackHole.setStrokeWidth(0.0);
//         blackHole.setType(javafx.scene.shape.ArcType.ROUND);

//         /* Add some blur effect to the black hole */
//         BoxBlur blackHoleBlur = new BoxBlur();
//         blackHoleBlur.setWidth(32.32);
//         blackHole.setEffect(blackHoleBlur);

//         /* Create a rectangle that represent the body
//         of the Rocket. The Rocket is divided it into two
//         rectangles to be able to change colors */
//         Rectangle rocketBodyLeft = new Rectangle();
//         rocketBodyLeft.setArcWidth(5.0);
//         rocketBodyLeft.setFill(Color.valueOf("#fa812a"));
//         rocketBodyLeft.setHeight(249.0);
//         rocketBodyLeft.setLayoutX(271.0);
//         rocketBodyLeft.setLayoutY(164.0);
//         rocketBodyLeft.setStrokeWidth(0.0);
//         rocketBodyLeft.setWidth(54.5);

//         Rectangle rocketBodyRight = new Rectangle();
//         rocketBodyRight.setArcWidth(5.0);
//         rocketBodyRight.setFill(Color.valueOf("#f56c11"));
//         rocketBodyRight.setHeight(249.0);
//         rocketBodyRight.setLayoutX(329.0);
//         rocketBodyRight.setLayoutY(165.0);
//         rocketBodyRight.setStrokeWidth(0.0);
//         rocketBodyRight.setTranslateX(-4.0);
//         rocketBodyRight.setTranslateY(-1.0);
//         rocketBodyRight.setWidth(54.5);

//         /* Right part of the Rocket Nose Cone (TOP)*/
//         Arc rightNoseCone = new Arc();
//         rightNoseCone.setFill(Color.valueOf("#752f00"));
//         rightNoseCone.setLayoutX(325.0);
//         rightNoseCone.setLayoutY(170.0);
//         rightNoseCone.setLength(90.0);
//         rightNoseCone.setRadiusX(55.0);
//         rightNoseCone.setRadiusY(89.0);
//         rightNoseCone.setStrokeWidth(0.0);
//         rightNoseCone.setType(ArcType.ROUND);

//         /* Defining color of the Linear Gradient in the top of the rocket*/
//         Stop[] stops = new Stop[]{
//             new Stop(0, Color.valueOf("#ab7216")),
//             new Stop(1, Color.valueOf("#752f00"))
//         };

//         /* Create Linear Gradient with the stops of the aboves colors*/
//         LinearGradient lg = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

//         /* Left Part of the Rocket Nose Cone (TOP)*/
//         Arc leftNoseCone = new Arc();
//         leftNoseCone.setFill(lg);
//         leftNoseCone.setLayoutX(326.0);
//         leftNoseCone.setLayoutY(170.0);
//         leftNoseCone.setLength(90.0);
//         leftNoseCone.setRadiusX(55.0);
//         leftNoseCone.setRadiusY(89.0);
//         leftNoseCone.setStartAngle(90.0);
//         leftNoseCone.setStrokeWidth(40.0);
//         leftNoseCone.setType(ArcType.ROUND);

//         /* Create two arcs that represent the inside Nose Cone */
//         Arc insideLeftNoseCone = new Arc();
//         insideLeftNoseCone.setFill(Color.valueOf("#ffe9d6"));
//         insideLeftNoseCone.setLayoutX(322.0);
//         insideLeftNoseCone.setLayoutY(242.0);
//         insideLeftNoseCone.setLength(90.0);
//         insideLeftNoseCone.setRadiusX(32.5);
//         insideLeftNoseCone.setRadiusY(70.0);
//         insideLeftNoseCone.setStartAngle(90.0);
//         insideLeftNoseCone.setStrokeWidth(0.0);
//         insideLeftNoseCone.setTranslateX(3.0);
//         insideLeftNoseCone.setTranslateY(6.0);
//         insideLeftNoseCone.setType(ArcType.ROUND);

//         Arc insideRightNoseCone = new Arc();
//         insideRightNoseCone.setFill(Color.valueOf("#fcd9bd"));
//         insideRightNoseCone.setLayoutX(322.0);
//         insideRightNoseCone.setLayoutY(242.0);
//         insideRightNoseCone.setLength(90.0);
//         insideRightNoseCone.setRadiusX(32.5);
//         insideRightNoseCone.setRadiusY(72.0);
//         insideRightNoseCone.setStrokeWidth(0.0);
//         insideRightNoseCone.setTranslateX(3.0);
//         insideRightNoseCone.setTranslateY(8.0);
//         insideRightNoseCone.setType(ArcType.ROUND);

//         /* Rocket Turbine Left Side */
//         Rectangle turbineLL = new Rectangle();
//         turbineLL.setArcWidth(5.0);
//         turbineLL.setFill(Color.valueOf("#ffe9d6"));
//         turbineLL.setHeight(186.0);
//         turbineLL.setLayoutX(224.0);
//         turbineLL.setLayoutY(246.0);
//         turbineLL.setStrokeWidth(0.0);
//         turbineLL.setTranslateX(1.0);
//         turbineLL.setWidth(23.5);

//         Rectangle turbineLR = new Rectangle();
//         turbineLR.setArcWidth(5.0);
//         turbineLR.setFill(Color.valueOf("#fcd4b8"));
//         turbineLR.setHeight(186.0);
//         turbineLR.setLayoutX(249.0);
//         turbineLR.setLayoutY(241.0);
//         turbineLR.setStrokeWidth(0.0);
//         turbineLR.setTranslateX(-1.0);
//         turbineLR.setTranslateY(5.0);
//         turbineLR.setWidth(23.5);
        
//         /* Rocket Turbine Right Side */
//         Rectangle turbineRL = new Rectangle();
//         turbineRL.setArcWidth(5.0);
//         turbineRL.setFill(Color.valueOf("#ffe9d6"));
//         turbineRL.setHeight(186.0);
//         turbineRL.setLayoutX(375.0);
//         turbineRL.setLayoutY(240.0);
//         turbineRL.setStrokeWidth(0.0);
//         turbineRL.setTranslateX(4.0);
//         turbineRL.setTranslateY(4.0);
//         turbineRL.setWidth(23.5);
        
//         Rectangle turbineRR = new Rectangle();
//         turbineRR.setArcWidth(5.0);
//         turbineRR.setFill(Color.valueOf("#fcd4b8"));
//         turbineRR.setHeight(186.0);
//         turbineRR.setLayoutX(403.0);
//         turbineRR.setLayoutY(244.0);
//         turbineRR.setStrokeWidth(0.0);
//         turbineRR.setTranslateX(-1.0);
//         turbineRR.setWidth(23.5);
        
//         /* Rectangles that represent the lines in the left turbine*/
//         Rectangle topLL = new Rectangle();
//         topLL.setArcWidth(5.0);
//         topLL.setFill(Color.valueOf("#4d2c15"));
//         topLL.setHeight(12.0);
//         topLL.setLayoutX(224.0);
//         topLL.setLayoutY(249.0);
//         topLL.setStrokeWidth(0.0);
//         topLL.setTranslateX(0.5);
//         topLL.setWidth(24.0);

//         Rectangle topLR = new Rectangle();
//         topLR.setArcWidth(5.0);
//         topLR.setFill(Color.valueOf("#301d0e"));
//         topLR.setHeight(12.0);
//         topLR.setLayoutX(248.0);
//         topLR.setLayoutY(252.0);
//         topLR.setStrokeWidth(0.0);
//         topLR.setTranslateY(-3.0);
//         topLR.setWidth(24.0);

//         Rectangle middleLL = new Rectangle();
//         middleLL.setArcWidth(5.0);
//         middleLL.setFill(Color.valueOf("#4d2c15"));
//         middleLL.setHeight(12.0);
//         middleLL.setLayoutX(224.0);
//         middleLL.setLayoutY(300.0);
//         middleLL.setStrokeWidth(0.0);
//         middleLL.setWidth(24.0);

//         Rectangle middleLR = new Rectangle();
//         middleLR.setArcWidth(5.0);
//         middleLR.setFill(Color.valueOf("#301d0e"));
//         middleLR.setHeight(12.0);
//         middleLR.setLayoutX(248.0);
//         middleLR.setLayoutY(303.0);
//         middleLR.setStrokeWidth(0.0);
//         middleLR.setTranslateY(-3.0);
//         middleLR.setWidth(24.0);

//         Rectangle bottomLR = new Rectangle();
//         bottomLR.setArcWidth(5.0);
//         bottomLR.setFill(Color.valueOf("#4d2c15"));
//         bottomLR.setHeight(12.0);
//         bottomLR.setLayoutX(224.0);
//         bottomLR.setLayoutY(318.0);
//         bottomLR.setStrokeWidth(0.0);
//         bottomLR.setWidth(24.0);

//         Rectangle bottomLL = new Rectangle();
//         bottomLL.setArcWidth(5.0);
//         bottomLL.setFill(Color.valueOf("#301d0e"));
//         bottomLL.setHeight(12.0);
//         bottomLL.setLayoutX(248.0);
//         bottomLL.setLayoutY(321.0);
//         bottomLL.setStrokeWidth(0.0);
//         bottomLL.setTranslateY(-3.0);
//         bottomLL.setWidth(24.0);

//         /* Rectangles that represent the lines in the right turbine*/
//         Rectangle topRL = new Rectangle();
//         topRL.setArcWidth(5.0);
//         topRL.setFill(Color.valueOf("#4d2c15"));
//         topRL.setHeight(12.0);
//         topRL.setLayoutX(379.0);
//         topRL.setLayoutY(249.0);
//         topRL.setStrokeWidth(0.0);
//         topRL.setWidth(24.0);
        
//         Rectangle topRR = new Rectangle();
//         topRR.setArcWidth(5.0);
//         topRR.setFill(Color.valueOf("#301d0e"));
//         topRR.setHeight(12.0);
//         topRR.setLayoutX(402.0);
//         topRR.setLayoutY(251.0);
//         topRR.setStrokeWidth(0.0);
//         topRR.setTranslateY(-2.0);
//         topRR.setWidth(24.0);
        
//         Rectangle middleRL = new Rectangle();
//         middleRL.setArcWidth(5.0);
//         middleRL.setFill(Color.valueOf("#4d2c15"));
//         middleRL.setHeight(12.0);
//         middleRL.setLayoutX(378.0);
//         middleRL.setLayoutY(300.0);
//         middleRL.setStrokeWidth(0.0);
//         middleRL.setWidth(24.0);
        
//         Rectangle middleRR = new Rectangle();
//         middleRR.setArcWidth(5.0);
//         middleRR.setFill(Color.valueOf("#301d0e"));
//         middleRR.setHeight(12.0);
//         middleRR.setLayoutX(401.0);
//         middleRR.setLayoutY(302.0);
//         middleRR.setStrokeWidth(0.0);
//         middleRR.setTranslateY(-2.0);
//         middleRR.setWidth(24.0);
        
//         Rectangle bottomRL = new Rectangle();
//         bottomRL.setArcWidth(5.0);
//         bottomRL.setFill(Color.valueOf("#4d2c15"));
//         bottomRL.setHeight(12.0);
//         bottomRL.setLayoutX(378.0);
//         bottomRL.setLayoutY(318.0);
//         bottomRL.setStrokeWidth(0.0);
//         bottomRL.setWidth(24.0);
        
//         Rectangle bottomRR = new Rectangle();
//         bottomRR.setArcWidth(5.0);
//         bottomRR.setFill(Color.valueOf("#301d0e"));
//         bottomRR.setHeight(12.0);
//         bottomRR.setLayoutX(401.0);
//         bottomRR.setLayoutY(320.0);
//         bottomRR.setStrokeWidth(0.0);
//         bottomRR.setTranslateY(-2.0);
//         bottomRR.setWidth(24.0);
        
//         /* Create arcs that represent the fings of the rocket */
     
//         Arc rightFing = new Arc(); //RIGHT SIDE (Bigest)
//         rightFing.setFill(Color.valueOf("#f56c11"));
//         rightFing.setLayoutX(358.0);
//         rightFing.setLayoutY(419.0);
//         rightFing.setLength(90.0);
//         rightFing.setRadiusX(94.0);
//         rightFing.setRadiusY(102.0);
//         rightFing.setStroke(Color.valueOf("#f0c243"));
//         rightFing.setStrokeType(StrokeType.INSIDE);
//         rightFing.setStrokeWidth(2.0);
//         rightFing.setTranslateX(-3.0);
//         rightFing.setTranslateY(1.0);
//         rightFing.setType(ArcType.ROUND);
        
//         Arc leftFing = new Arc();//LEFT SIDE (Bigest)
//         leftFing.setFill(Color.valueOf("#f56c11"));
//         leftFing.setLayoutX(294.0);
//         leftFing.setLayoutY(451.0);
//         leftFing.setLength(90.0);
//         leftFing.setRadiusX(94.0);
//         leftFing.setRadiusY(102.0);
//         leftFing.setStartAngle(90.0);
//         leftFing.setStroke(Color.valueOf("#f0c243"));
//         leftFing.setStrokeType(StrokeType.INSIDE);
//         leftFing.setStrokeWidth(2.0);
//         leftFing.setTranslateX(1.0);
//         leftFing.setTranslateY(-31.0);
//         leftFing.setType(ArcType.ROUND);
        
//         Arc rightFingSmall = new Arc(); //RIGHT SIDE (Smallest)
//         rightFingSmall.setFill(Color.valueOf("#f56c11"));
//         rightFingSmall.setLayoutX(357.0);
//         rightFingSmall.setLayoutY(307.0);
//         rightFingSmall.setLength(180.0);
//         rightFingSmall.setRadiusX(28.0);
//         rightFingSmall.setRadiusY(48.0);
//         rightFingSmall.setStartAngle(270.0);
//         rightFingSmall.setStrokeType(StrokeType.INSIDE);
//         rightFingSmall.setStrokeWidth(2.0);
//         rightFingSmall.setTranslateX(-1.0);
//         rightFingSmall.setTranslateY(1.0);
//         rightFingSmall.setType(ArcType.ROUND);

//         Arc leftFingSmall = new Arc(); //LEFT SIDE (Smallest)
//         leftFingSmall.setFill(Color.valueOf("#f56c11"));
//         leftFingSmall.setLayoutX(293.0);
//         leftFingSmall.setLayoutY(339.0);
//         leftFingSmall.setLength(180.0);
//         leftFingSmall.setRadiusX(28.0);
//         leftFingSmall.setRadiusY(48.0);
//         leftFingSmall.setStartAngle(90.0);
//         leftFingSmall.setStrokeType(StrokeType.INSIDE);
//         leftFingSmall.setStrokeWidth(2.0);
//         leftFingSmall.setTranslateX(1.0);
//         leftFingSmall.setTranslateY(-31.0);
//         leftFingSmall.setType(ArcType.ROUND);
        
//         /* Rectangle that represents the inside body of the rocket */
//         Rectangle leftPartInside = new Rectangle();
//         leftPartInside.setArcWidth(5.0);
//         leftPartInside.setFill(Color.valueOf("#ffe9d6"));
//         leftPartInside.setHeight(186.0);
//         leftPartInside.setLayoutX(293.0);
//         leftPartInside.setLayoutY(246.0);
//         leftPartInside.setStrokeWidth(0.0);
//         leftPartInside.setWidth(32.5);  
        
//         /* Polygons that represent the motors of the Rocket */
//         Polygon leftMotorSmall = new Polygon();
//         leftMotorSmall.setFill(Color.valueOf("#fa812a"));
//         leftMotorSmall.setLayoutX(238.0);
//         leftMotorSmall.setLayoutY(424.0);
//         leftMotorSmall.setScaleX(2.0);
//         leftMotorSmall.setStrokeWidth(0.0);
//         leftMotorSmall.setTranslateY(-2.0);
        
//         Polygon leftMotorBig = new Polygon();
//         leftMotorBig.setFill(Color.valueOf("#fae061"));
//         leftMotorBig.setLayoutX(395.0);
//         leftMotorBig.setLayoutY(429.0);
//         leftMotorBig.setScaleX(3.0);
//         leftMotorBig.setScaleY(1.5);
//         leftMotorBig.setStrokeWidth(0.0);
//         leftMotorBig.setTranslateX(-157.0);
//         leftMotorBig.setTranslateY(5.0);
        
//         Polygon leftMotorShadow = new Polygon();
//         leftMotorShadow.setFill(Color.valueOf("#fc6c05"));
//         leftMotorShadow.setLayoutX(233.0);
//         leftMotorShadow.setLayoutY(488.0);
//         leftMotorShadow.setScaleX(2.0);
//         leftMotorShadow.setStroke(Color.valueOf("#fa6b05"));
//         leftMotorShadow.setStrokeType(StrokeType.INSIDE);
//         leftMotorShadow.setStrokeWidth(0.0);
//         leftMotorShadow.setTranslateX(5.0);
//         leftMotorShadow.setTranslateY(-67.0);
        
//         Polygon rightMotorSmall = new Polygon();
//         rightMotorSmall.setFill(Color.valueOf("#fa812a"));
//         rightMotorSmall.setLayoutX(395.0);
//         rightMotorSmall.setLayoutY(422.0);
//         rightMotorSmall.setScaleX(2.0);
//         rightMotorSmall.setStrokeWidth(0.0);
//         rightMotorSmall.setTranslateY(-2.0);
        
//         Polygon rightMotorBig = new Polygon();
//         rightMotorBig.setFill(Color.valueOf("#fae061"));
//         rightMotorBig.setLayoutX(405.0);
//         rightMotorBig.setLayoutY(439.0);
//         rightMotorBig.setScaleX(3.0);
//         rightMotorBig.setScaleY(1.5);
//         rightMotorBig.setStrokeWidth(0.0);
//         rightMotorBig.setTranslateX(-11.0);
//         rightMotorBig.setTranslateY(-7.0);
        
//         Polygon rightMotorShadow = new Polygon();
//         rightMotorShadow.setFill(Color.valueOf("#fc6c05"));
//         rightMotorShadow.setLayoutX(243.0);
//         rightMotorShadow.setLayoutY(498.0);
//         rightMotorShadow.setScaleX(2.0);
//         rightMotorShadow.setStrokeWidth(0.0);
//         rightMotorShadow.setTranslateX(152.0);
//         rightMotorShadow.setTranslateY(-79.0);
        
//         /* Square that represents the inside motors */
//         Rectangle toInsideMotorL = new Rectangle();
//         toInsideMotorL.setArcWidth(5.0);
//         toInsideMotorL.setFill(Color.valueOf("#ffdd54"));
//         toInsideMotorL.setHeight(5.0);
//         toInsideMotorL.setLayoutX(298.0);
//         toInsideMotorL.setLayoutY(440.0);
//         toInsideMotorL.setStrokeWidth(0.0);
//         toInsideMotorL.setTranslateX(5.0);
//         toInsideMotorL.setTranslateY(2.0);
//         toInsideMotorL.setWidth(13.0);
        
//         Rectangle toInsideMotorR = new Rectangle();
//         toInsideMotorR.setArcWidth(5.0);
//         toInsideMotorR.setFill(Color.valueOf("#ffdd54"));
//         toInsideMotorR.setHeight(5.0);
//         toInsideMotorR.setLayoutX(330.0);
//         toInsideMotorR.setLayoutY(442.0);
//         toInsideMotorR.setStrokeWidth(0.0);
//         toInsideMotorR.setTranslateX(4.0);
//         toInsideMotorR.setWidth(13.0);
        
//         /* INSIDE BODY OF THE ROCKET */
//         Rectangle rightInsideBody = new Rectangle();
//         rightInsideBody.setArcWidth(5.0);
//         rightInsideBody.setFill(Color.valueOf("#fcd9bd"));
//         rightInsideBody.setHeight(186.0);
//         rightInsideBody.setLayoutX(326.0);
//         rightInsideBody.setLayoutY(246.0);
//         rightInsideBody.setStrokeWidth(0.0);
//         rightInsideBody.setTranslateX(-1.0);
//         rightInsideBody.setWidth(32.5);
        
//         Rectangle toInsideMotorSmallL = new Rectangle();
//         toInsideMotorSmallL.setArcWidth(5.0);
//         toInsideMotorSmallL.setHeight(2.0);
//         toInsideMotorSmallL.setLayoutX(303.0);
//         toInsideMotorSmallL.setLayoutY(446.0);
//         toInsideMotorSmallL.setStrokeWidth(0.0);
//         toInsideMotorSmallL.setWidth(13.0);
        
//         Rectangle toInsideMotorSmallR = new Rectangle();
//         toInsideMotorSmallR.setArcWidth(5.0);
//         toInsideMotorSmallR.setHeight(2.0);
//         toInsideMotorSmallR.setLayoutX(332.0);
//         toInsideMotorSmallR.setLayoutY(448.0);
//         toInsideMotorSmallR.setStrokeWidth(0.0);
//         toInsideMotorSmallR.setTranslateX(2.0);
//         toInsideMotorSmallR.setTranslateY(-1.0);
//         toInsideMotorSmallR.setWidth(13.0);
        
//         /* Yellow rectangle at the bottom of the inside body */
//         Rectangle yellowBottom = new Rectangle();
//         yellowBottom.setArcWidth(5.0);
//         yellowBottom.setFill(Color.valueOf("#fcda4e"));
//         yellowBottom.setHeight(17.0);
//         yellowBottom.setLayoutX(293.0);
//         yellowBottom.setLayoutY(432.0);
//         yellowBottom.setStrokeWidth(0.0);
//         yellowBottom.setTranslateY(-7.0);
//         yellowBottom.setWidth(65.0);
        
//         /* Yellow motors in the inside body part of the rocket */
//         Polygon leftSmallMotor = new Polygon();
//         leftSmallMotor.setFill(Color.valueOf("#fae061"));
//         leftSmallMotor.setLayoutX(298.0);
//         leftSmallMotor.setLayoutY(441.0);
//         leftSmallMotor.setScaleY(0.6);
//         leftSmallMotor.setStrokeWidth(0.0);
//         leftSmallMotor.setTranslateX(2.0);
//         leftSmallMotor.setTranslateY(-5.0);

//         Polygon rightSmallMotor = new Polygon();
//         rightSmallMotor.setFill(Color.valueOf("#fae061"));
//         rightSmallMotor.setLayoutX(331.0);
//         rightSmallMotor.setLayoutY(441.0);
//         rightSmallMotor.setScaleY(0.6);
//         rightSmallMotor.setStrokeWidth(0.0);
//         rightSmallMotor.setTranslateY(-4.0);
        
        
//         /* Lines on the inside part of the rocket */
//         Line line = new Line();
//         line.setEndX(99.5);
//         line.setLayoutX(106.0);
//         line.setLayoutY(217.0);
//         line.setStartX(68.0);
//         line.setStroke(Color.valueOf("#d69267"));
//         line.setStrokeWidth(2.0);
//         line.setTranslateX(151.0);
//         line.setTranslateY(29.0);
        
//         Line line0 = new Line();
//         line0.setEndX(97.5);
//         line0.setLayoutX(229.0);
//         line0.setLayoutY(246.0);
//         line0.setStartX(67.0);
//         line0.setStroke(Color.valueOf("#e6c6ae"));
//         line0.setStrokeWidth(2.0);
//         line0.setTranslateX(-2.5);

//         Line line1 = new Line();
//         line1.setEndX(97.5);
//         line1.setLayoutX(229.0);
//         line1.setLayoutY(380.0);
//         line1.setStartX(67.0);
//         line1.setStroke(Color.valueOf("#e6c6ae"));
//         line1.setStrokeWidth(2.0);
//         line1.setTranslateX(-2.0);
//         line1.setTranslateY(-14.0);
        
//         Line line2 = new Line();
//         line2.setEndX(98.5);
//         line2.setLayoutX(258.0);
//         line2.setLayoutY(367.0);
//         line2.setStartX(68.0);
//         line2.setStroke(Color.valueOf("#d69267"));
//         line2.setStrokeWidth(2.0);
//         line2.setTranslateY(-1.0);
        
//         /* Images of the NASA and US Flag */
//         ImageView nasaLogo = new ImageView();
//         nasaLogo.setFitHeight(95.0);
//         nasaLogo.setFitWidth(62.5);
//         nasaLogo.setLayoutX(297.0);
//         nasaLogo.setLayoutY(280.0);
//         nasaLogo.setPickOnBounds(true);
//         nasaLogo.setPreserveRatio(true);
//         nasaLogo.setTranslateX(-3.0);
//         nasaLogo.setImage(new Image(getClass().getResource("images/nasa.png").toExternalForm()));
        
//         ImageView usaFlag = new ImageView();
//         usaFlag.setAccessibleText("us_flag");
//         usaFlag.setFitHeight(20.0);
//         usaFlag.setFitWidth(26.0);
//         usaFlag.setLayoutX(282.0);
//         usaFlag.setLayoutY(376.0);
//         usaFlag.setPickOnBounds(true);
//         usaFlag.setPreserveRatio(true);
//         usaFlag.setTranslateX(27.0);
//         usaFlag.setTranslateY(13.0);
//         usaFlag.setImage(new Image(getClass().getResource("images/us.png").toExternalForm()));

//         /* Black window of the rocket */
//         Arc rocketWindow = new Arc();
//         rocketWindow.setFill(Color.valueOf("#262120"));
//         rocketWindow.setLayoutX(326.0);
//         rocketWindow.setLayoutY(224.0);
//         rocketWindow.setLength(180.0);
//         rocketWindow.setRadiusX(25.0);
//         rocketWindow.setRadiusY(23.0);
//         rocketWindow.setTranslateX(-1.0);
//         rocketWindow.setTranslateY(1.0);
//         rocketWindow.setType(ArcType.ROUND);
        
//         /* Rectangles that cover the arc black arc that makes the windows
//        making the arc looks like a window */
//         Rectangle leftDivisorOfWindow = new Rectangle();
//         leftDivisorOfWindow.setArcWidth(5.0);
//         leftDivisorOfWindow.setFill(Color.valueOf("#fce6d4"));
//         leftDivisorOfWindow.setHeight(21.0);
//         leftDivisorOfWindow.setLayoutX(307.0);
//         leftDivisorOfWindow.setLayoutY(204.0);
//         leftDivisorOfWindow.setRotate(132.0);
//         leftDivisorOfWindow.setStrokeWidth(0.0);
//         leftDivisorOfWindow.setWidth(5.0);
        
//         Rectangle leftBorderOfTheWindow = new Rectangle();
//         leftBorderOfTheWindow.setArcWidth(5.0);
//         leftBorderOfTheWindow.setFill(Color.valueOf("#fce6d4"));
//         leftBorderOfTheWindow.setHeight(15.0);
//         leftBorderOfTheWindow.setLayoutX(301.0);
//         leftBorderOfTheWindow.setLayoutY(223.0);
//         leftBorderOfTheWindow.setRotate(132.0);
//         leftBorderOfTheWindow.setStrokeWidth(0.0);
//         leftBorderOfTheWindow.setTranslateX(-3.0);
//         leftBorderOfTheWindow.setTranslateY(-4.0);
//         leftBorderOfTheWindow.setWidth(10.0);
        
//         Rectangle rightDivisorOfTheWindow = new Rectangle();
//         rightDivisorOfTheWindow.setArcWidth(5.0);
//         rightDivisorOfTheWindow.setFill(Color.valueOf("#fcd9bd"));
//         rightDivisorOfTheWindow.setHeight(21.0);
//         rightDivisorOfTheWindow.setLayoutX(317.0);
//         rightDivisorOfTheWindow.setLayoutY(214.0);
//         rightDivisorOfTheWindow.setRotate(-132.0);
//         rightDivisorOfTheWindow.setStrokeWidth(0.0);
//         rightDivisorOfTheWindow.setTranslateX(19.0);
//         rightDivisorOfTheWindow.setTranslateY(-9.0);
//         rightDivisorOfTheWindow.setWidth(5.0);
        
//         Rectangle rightBorderOfTheWindow = new Rectangle();
//         rightBorderOfTheWindow.setArcWidth(5.0);
//         rightBorderOfTheWindow.setFill(Color.valueOf("#fcd9bd"));
//         rightBorderOfTheWindow.setHeight(15.0);
//         rightBorderOfTheWindow.setLayoutX(311.0);
//         rightBorderOfTheWindow.setLayoutY(233.0);
//         rightBorderOfTheWindow.setRotate(-132.0);
//         rightBorderOfTheWindow.setStrokeWidth(0.0);
//         rightBorderOfTheWindow.setTranslateX(31.0);
//         rightBorderOfTheWindow.setTranslateY(-13.0);
//         rightBorderOfTheWindow.setWidth(10.0);
        
//         /* Arcs that made the window looks like a ring */
//         Arc rightWRing = new Arc();
//         rightWRing.setFill(Color.valueOf("#fcd4b8"));
//         rightWRing.setLayoutX(99.0);
//         rightWRing.setLayoutY(143.0);
//         rightWRing.setLength(90.0);
//         rightWRing.setRadiusX(21.0);
//         rightWRing.setRadiusY(21.0);
//         rightWRing.setStrokeWidth(0.0);
//         rightWRing.setTranslateX(226.0);
//         rightWRing.setTranslateY(92.0);
//         rightWRing.setType(ArcType.ROUND);
        
//         Arc leftWRing = new Arc();
//         leftWRing.setFill(Color.valueOf("#ffe9d6"));
//         leftWRing.setLayoutX(99.0);
//         leftWRing.setLayoutY(143.0);
//         leftWRing.setLength(90.0);
//         leftWRing.setRadiusX(21.0);
//         leftWRing.setRadiusY(21.0);
//         leftWRing.setStartAngle(90.0);
//         leftWRing.setStrokeWidth(0.0);
//         leftWRing.setTranslateX(226.0);
//         leftWRing.setTranslateY(92.0);
//         leftWRing.setType(ArcType.ROUND);
        
//         /* Black parts of the motor at the bottom of each body part */
//         Rectangle blackPartofTheMotorL = new Rectangle();
//         blackPartofTheMotorL.setArcWidth(5.0);
//         blackPartofTheMotorL.setHeight(12.0);
//         blackPartofTheMotorL.setLayoutX(225.0);
//         blackPartofTheMotorL.setLayoutY(415.0);
//         blackPartofTheMotorL.setStrokeWidth(0.0);
//         blackPartofTheMotorL.setTranslateY(5.0);
//         blackPartofTheMotorL.setWidth(47.0);
        
//         Rectangle blackPartofTheMotorR = new Rectangle();
//         blackPartofTheMotorR.setArcWidth(5.0);
//         blackPartofTheMotorR.setHeight(12.0);
//         blackPartofTheMotorR.setLayoutX(235.0);
//         blackPartofTheMotorR.setLayoutY(425.0);
//         blackPartofTheMotorR.setStrokeWidth(0.0);
//         blackPartofTheMotorR.setTranslateX(144.0);
//         blackPartofTheMotorR.setTranslateY(-5.0);
//         blackPartofTheMotorR.setWidth(47.0);
        
//         /* Borders between the Body Tube of the rocket and the nose cone */
//         Rectangle borderLineL = new Rectangle();
//         borderLineL.setArcWidth(5.0);
//         borderLineL.setFill(Color.valueOf("#fff4d1"));
//         borderLineL.setHeight(5.0);
//         borderLineL.setLayoutX(259.0);
//         borderLineL.setLayoutY(172.0);
//         borderLineL.setStrokeWidth(0.0);
//         borderLineL.setTranslateX(12.0);
//         borderLineL.setTranslateY(-4.0);
//         borderLineL.setWidth(54.5);
        
//         Rectangle borderLineR = new Rectangle();
//         borderLineR.setArcWidth(5.0);
//         borderLineR.setFill(Color.valueOf("#fce386"));
//         borderLineR.setHeight(5.0);
//         borderLineR.setLayoutX(312.0);
//         borderLineR.setLayoutY(168.0);
//         borderLineR.setStrokeWidth(0.0);
//         borderLineR.setTranslateX(13.0);
//         borderLineR.setWidth(54.5);
        
//         /* Polyline that represent the stars with Cross Form */
//         Polyline starWithCrossForm = new Polyline();
//         starWithCrossForm.setFill(Color.valueOf("#b0b4b8"));
//         starWithCrossForm.setLayoutX(102.0);
//         starWithCrossForm.setLayoutY(73.0);
//         starWithCrossForm.setStrokeType(StrokeType.INSIDE);
//         starWithCrossForm.setStrokeWidth(0.0);
//         starWithCrossForm.setTranslateX(139.0);
//         starWithCrossForm.setTranslateY(-66.0);
        
//         Polyline starWithCrossForm1 = new Polyline();
//         starWithCrossForm1.setFill(Color.valueOf("#c4cad0"));
//         starWithCrossForm1.setLayoutX(112.0);
//         starWithCrossForm1.setLayoutY(83.0);
//         starWithCrossForm1.setStrokeType(StrokeType.INSIDE);
//         starWithCrossForm1.setStrokeWidth(0.0);
//         starWithCrossForm1.setTranslateX(22.0);
//         starWithCrossForm1.setTranslateY(30.0);
        
//         /***************** CLOUDS ****************************/
//         Ellipse cloud = new Ellipse();
//         DropShadow cloudShadow = new DropShadow();
//         cloud.setFill(Color.valueOf("#385e96"));
//         cloud.setLayoutX(633.0);
//         cloud.setLayoutY(442.0);
//         cloud.setRadiusX(41.0);
//         cloud.setRadiusY(45.0);
//         cloud.setStroke(Color.BLACK);
//         cloud.setStrokeType(StrokeType.INSIDE);
//         cloud.setStrokeWidth(0.0);
//         cloudShadow.setColor(Color.valueOf("#385e96"));
//         cloudShadow.setHeight(72.61);
//         cloudShadow.setRadius(41.1175);
//         cloudShadow.setSpread(0.38);
//         cloudShadow.setWidth(93.86);
//         cloud.setEffect(cloudShadow);
        
//         Ellipse cloud1 = new Ellipse();
//         DropShadow cloud1Shadow = new DropShadow();
//         cloud1.setFill(Color.valueOf("#385e96"));
//         cloud1.setLayoutX(587.0);
//         cloud1.setLayoutY(529.0);
//         cloud1.setRadiusX(90.0);
//         cloud1.setRadiusY(80.0);
//         cloud1.setStrokeType(StrokeType.INSIDE);
//         cloud1.setStrokeWidth(0.0);
//         cloud1Shadow.setColor(Color.valueOf("#385e96"));
//         cloud1Shadow.setHeight(169.75);
//         cloud1Shadow.setRadius(92.7225);
//         cloud1Shadow.setSpread(0.54);
//         cloud1Shadow.setWidth(203.14);
//         cloud1.setEffect(cloud1Shadow);
        
//         Ellipse cloud2 = new Ellipse();
//          DropShadow cloud2Shadow = new DropShadow();
//         cloud2.setFill(Color.valueOf("#385e96"));
//         cloud2.setLayoutX(477.0);
//         cloud2.setLayoutY(553.0);
//         cloud2.setRadiusX(51.0);
//         cloud2.setRadiusY(56.0);
//         cloud2.setStrokeType(StrokeType.INSIDE);
//         cloud2.setStrokeWidth(0.0);
//         cloud2Shadow.setColor(Color.valueOf("#385e96"));
//         cloud2Shadow.setHeight(151.54);
//         cloud2Shadow.setRadius(93.48249);
//         cloud2Shadow.setSpread(0.6);
//         cloud2Shadow.setWidth(224.39);
//         cloud2.setEffect(cloud2Shadow);
        
//         Ellipse cloud3 = new Ellipse();
//         DropShadow cloud3Shadow = new DropShadow();
//         cloud3.setFill(Color.valueOf("#385e96"));
//         cloud3.setLayoutX(434.0);
//         cloud3.setLayoutY(609.0);
//         cloud3.setRadiusX(47.0);
//         cloud3.setRadiusY(47.0);
//         cloud3.setStrokeWidth(0.0);
//         cloud3Shadow.setColor(Color.valueOf("#385e96"));
//         cloud3Shadow.setHeight(148.5);
//         cloud3Shadow.setRadius(79.0625);
//         cloud3Shadow.setSpread(0.47);
//         cloud3Shadow.setWidth(169.75);
//         cloud3.setEffect(cloud3Shadow);
        
//         Ellipse cloud4 = new Ellipse();
//         DropShadow cloud4Shadow = new DropShadow();
//          cloud4.setFill(Color.valueOf("#385e96"));
//         cloud4.setLayoutX(385.0);
//         cloud4.setLayoutY(584.0);
//         cloud4.setRadiusX(34.0);
//         cloud4.setRadiusY(32.0);
//         cloud4.setStrokeWidth(0.0);
//         cloud4Shadow.setColor(Color.valueOf("#385e96"));
//         cloud4Shadow.setHeight(106.0);
//         cloud4Shadow.setRadius(51.739);
//         cloud4Shadow.setSpread(0.08);
//         cloud4Shadow.setWidth(102.96);
//         cloud4.setEffect(cloud4Shadow);
        
//         Ellipse cloud5 = new Ellipse();
//         DropShadow cloud5Shadow = new DropShadow();
//         cloud5.setFill(Color.WHITE);
//         cloud5.setLayoutX(639.0);
//         cloud5.setLayoutY(528.0);
//         cloud5.setRadiusX(41.0);
//         cloud5.setRadiusY(40.0);
//         cloud5.setStrokeType(StrokeType.INSIDE);
//         cloud5.setStrokeWidth(0.0);
//         cloud5Shadow.setColor(Color.WHITE);
//         cloud5Shadow.setHeight(48.32);
//         cloud5Shadow.setRadius(19.1075);
//         cloud5Shadow.setSpread(0.4);
//         cloud5Shadow.setWidth(30.11);
//         cloud5.setEffect(cloud5Shadow);
        
//         Ellipse cloud6 = new Ellipse();
//         DropShadow cloud6Shadow = new DropShadow();
//         cloud6.setFill(Color.WHITE);
//         cloud6.setLayoutX(604.0);
//         cloud6.setLayoutY(565.0);
//         cloud6.setRadiusX(28.0);
//         cloud6.setRadiusY(32.0);
//         cloud6.setStrokeWidth(0.0);
//         cloud6Shadow.setColor(Color.WHITE);
//         cloud6Shadow.setHeight(48.32);
//         cloud6Shadow.setRadius(19.1075);
//         cloud6Shadow.setSpread(0.4);
//         cloud6Shadow.setWidth(30.11);
//         cloud6.setEffect(cloud6Shadow);
        
//         Ellipse cloud7 = new Ellipse();
//         DropShadow cloud7Shadow = new DropShadow();
//         cloud7.setFill(Color.WHITE);
//         cloud7.setLayoutX(571.0);
//         cloud7.setLayoutY(572.0);
//         cloud7.setRadiusX(28.0);
//         cloud7.setRadiusY(32.0);
//         cloud7.setStrokeWidth(0.0);
//         cloud7Shadow.setColor(Color.WHITE);
//         cloud7Shadow.setHeight(48.32);
//         cloud7Shadow.setRadius(19.1075);
//         cloud7Shadow.setSpread(0.4);
//         cloud7Shadow.setWidth(30.11);
//         cloud7.setEffect(cloud7Shadow);
        
//         Ellipse cloud8 = new Ellipse();
//         DropShadow cloud8Shadow = new DropShadow();
//         cloud8.setFill(Color.WHITE);
//         cloud8.setLayoutX(544.0);
//         cloud8.setLayoutY(543.0);
//         cloud8.setRadiusX(30.0);
//         cloud8.setRadiusY(35.0);
//         cloud8.setStrokeWidth(0.0);
//         cloud8Shadow.setColor(Color.WHITE);
//         cloud8Shadow.setHeight(48.32);
//         cloud8Shadow.setRadius(19.1075);
//         cloud8Shadow.setSpread(0.4);
//         cloud8Shadow.setWidth(30.11);
//         cloud8.setEffect(cloud8Shadow);
        
//         Ellipse cloud9 = new Ellipse();
//         DropShadow cloud9Shadow = new DropShadow();
//         cloud9.setFill(Color.WHITE);
//         cloud9.setLayoutX(496.0);
//         cloud9.setLayoutY(581.0);
//         cloud9.setRadiusX(34.0);
//         cloud9.setRadiusY(33.0);
//         cloud9.setStrokeWidth(0.0);
//         cloud9Shadow.setColor(Color.WHITE);
//         cloud9Shadow.setHeight(48.32);
//         cloud9Shadow.setRadius(19.1075);
//         cloud9Shadow.setSpread(0.4);
//         cloud9Shadow.setWidth(30.11);
//         cloud9.setEffect(cloud9Shadow);
        
//         Ellipse cloud10 = new Ellipse();
//         DropShadow cloud10Shadow = new DropShadow();
//         cloud10.setFill(Color.WHITE);
//         cloud10.setLayoutX(448.0);
//         cloud10.setLayoutY(593.0);
//         cloud10.setRadiusX(28.0);
//         cloud10.setRadiusY(32.0);
//         cloud10.setStrokeWidth(0.0);
//         cloud10Shadow.setColor(Color.WHITE);
//         cloud10Shadow.setHeight(48.32);
//         cloud10Shadow.setRadius(19.1075);
//         cloud10Shadow.setSpread(0.4);
//         cloud10Shadow.setWidth(30.11);
//         cloud10.setEffect(cloud10Shadow);
        
//         Ellipse cloud11 = new Ellipse();
//         DropShadow cloud11Shadow = new DropShadow();
//         cloud11.setFill(Color.WHITE);
//         cloud11.setLayoutX(406.0);
//         cloud11.setLayoutY(603.0);
//         cloud11.setRadiusX(28.0);
//         cloud11.setRadiusY(32.0);
//         cloud11.setStrokeWidth(0.0);
//         cloud11Shadow.setColor(Color.WHITE);
//         cloud11Shadow.setHeight(48.32);
//         cloud11Shadow.setRadius(19.1075);
//         cloud11Shadow.setSpread(0.4);
//         cloud11Shadow.setWidth(30.11);
//         cloud11.setEffect(cloud11Shadow);
        
//         Ellipse cloud12 = new Ellipse();
//         DropShadow cloud12Shadow = new DropShadow();
//         cloud12.setFill(Color.WHITE);
//         cloud12.setLayoutX(368.0);
//         cloud12.setLayoutY(576.0);
//         cloud12.setRadiusX(19.0);
//         cloud12.setRadiusY(26.0);
//         cloud12.setStrokeWidth(0.0);
//         cloud12Shadow.setColor(Color.WHITE);
//         cloud12Shadow.setHeight(48.32);
//         cloud12Shadow.setRadius(19.1075);
//         cloud12Shadow.setSpread(0.4);
//         cloud12Shadow.setWidth(30.11);
//         cloud12.setEffect(cloud12Shadow);
        
//         Ellipse cloud13 = new Ellipse();
//         DropShadow cloud13Shadow = new DropShadow();
//         cloud13.setFill(Color.WHITE);
//         cloud13.setLayoutX(336.0);
//         cloud13.setLayoutY(588.0);
//         cloud13.setRadiusX(28.0);
//         cloud13.setRadiusY(32.0);
//         cloud13.setStrokeWidth(0.0);
//         cloud13Shadow.setColor(Color.WHITE);
//         cloud13Shadow.setHeight(48.32);
//         cloud13Shadow.setRadius(19.1075);
//         cloud13Shadow.setSpread(0.4);
//         cloud13Shadow.setWidth(30.11);
//         cloud13.setEffect(cloud13Shadow);
        
//         Ellipse cloud14 = new Ellipse();
//         DropShadow cloud14Shadow = new DropShadow();
//         cloud14.setFill(Color.WHITE);
//         cloud14.setLayoutX(298.0);
//         cloud14.setLayoutY(587.0);
//         cloud14.setRadiusX(19.0);
//         cloud14.setRadiusY(27.0);
//         cloud14.setStrokeWidth(0.0);
//         cloud14Shadow.setColor(Color.WHITE);
//         cloud14Shadow.setHeight(48.32);
//         cloud14Shadow.setRadius(19.1075);
//         cloud14Shadow.setSpread(0.4);
//         cloud14Shadow.setWidth(30.11);
//         cloud14.setEffect(cloud14Shadow);
        
//         Ellipse cloud15 = new Ellipse();
//         DropShadow cloud15Shadow = new DropShadow();
//         cloud15.setFill(Color.WHITE);
//         cloud15.setLayoutX(15.0);
//         cloud15.setLayoutY(489.0);
//         cloud15.setRadiusX(28.0);
//         cloud15.setRadiusY(32.0);
//         cloud15.setStrokeWidth(0.0);
//         cloud15Shadow.setColor(Color.WHITE);
//         cloud15Shadow.setHeight(48.32);
//         cloud15Shadow.setRadius(19.1075);
//         cloud15Shadow.setSpread(0.4);
//         cloud15Shadow.setWidth(30.11);
//         cloud15.setEffect(cloud15Shadow);
        
//         Ellipse cloud16 = new Ellipse();
//         DropShadow cloud16Shadow = new DropShadow();
//         cloud16.setFill(Color.WHITE);
//         cloud16.setLayoutX(149.0);
//         cloud16.setLayoutY(602.0);
//         cloud16.setRadiusX(28.0);
//         cloud16.setRadiusY(24.0);
//         cloud16.setStrokeWidth(0.0);
//         cloud16Shadow.setColor(Color.WHITE);
//         cloud16Shadow.setHeight(48.32);
//         cloud16Shadow.setRadius(19.1075);
//         cloud16Shadow.setSpread(0.4);
//         cloud16Shadow.setWidth(30.11);
//         cloud16.setEffect(cloud16Shadow);
        
//         Ellipse cloud17 = new Ellipse();
//         DropShadow cloud17Shadow = new DropShadow();
//         cloud17.setFill(Color.WHITE);
//         cloud17.setLayoutX(32.0);
//         cloud17.setLayoutY(540.0);
//         cloud17.setRadiusX(28.0);
//         cloud17.setRadiusY(32.0);
//         cloud17.setStrokeWidth(0.0);
//         cloud17Shadow.setColor(Color.WHITE);
//         cloud17Shadow.setHeight(48.32);
//         cloud17Shadow.setRadius(19.1075);
//         cloud17Shadow.setSpread(0.4);
//         cloud17Shadow.setWidth(30.11);
//         cloud17.setEffect(cloud17Shadow);
        
//         Ellipse cloud18 = new Ellipse();
//         DropShadow cloud18Shadow = new DropShadow();
//         cloud18.setFill(Color.WHITE);
//         cloud18.setLayoutX(62.0);
//         cloud18.setLayoutY(534.0);
//         cloud18.setRadiusX(20.0);
//         cloud18.setRadiusY(23.0);
//         cloud18.setStrokeWidth(0.0);
//         cloud18Shadow.setColor(Color.WHITE);
//         cloud18Shadow.setHeight(48.32);
//         cloud18Shadow.setRadius(19.1075);
//         cloud18Shadow.setSpread(0.4);
//         cloud18Shadow.setWidth(30.11);
//         cloud18.setEffect(cloud18Shadow);
        
//         Ellipse cloud19 = new Ellipse();
//         DropShadow cloud19Shadow = new DropShadow();
//         cloud19.setFill(Color.WHITE);
//         cloud19.setLayoutX(80.0);
//         cloud19.setLayoutY(565.0);
//         cloud19.setRadiusX(20.0);
//         cloud19.setRadiusY(23.0);
//         cloud19.setStrokeWidth(0.0);
//         cloud19Shadow.setColor(Color.WHITE);
//         cloud19Shadow.setHeight(48.32);
//         cloud19Shadow.setRadius(19.1075);
//         cloud19Shadow.setSpread(0.4);
//         cloud19Shadow.setWidth(30.11);
//         cloud19.setEffect(cloud19Shadow);
        
//         Ellipse cloud20 = new Ellipse();
//         DropShadow cloud20Shadow = new DropShadow();
//         cloud20.setFill(Color.WHITE);
//         cloud20.setLayoutX(124.0);
//         cloud20.setLayoutY(570.0);
//         cloud20.setRadiusX(34.0);
//         cloud20.setRadiusY(29.0);
//         cloud20.setStrokeWidth(0.0);
//         cloud20Shadow.setColor(Color.WHITE);
//         cloud20Shadow.setHeight(48.32);
//         cloud20Shadow.setRadius(19.1075);
//         cloud20Shadow.setSpread(0.4);
//         cloud20Shadow.setWidth(30.11);
//         cloud20.setEffect(cloud20Shadow);
        
//         Ellipse cloud21 = new Ellipse();
//         DropShadow cloud21Shadow = new DropShadow();
//         cloud21.setFill(Color.WHITE);
//         cloud21.setLayoutX(171.0);
//         cloud21.setLayoutY(565.0);
//         cloud21.setRadiusX(28.0);
//         cloud21.setRadiusY(24.0);
//         cloud21.setStrokeWidth(0.0);
//         cloud21Shadow.setColor(Color.WHITE);
//         cloud21Shadow.setHeight(48.32);
//         cloud21Shadow.setRadius(19.1075);
//         cloud21Shadow.setSpread(0.4);
//         cloud21Shadow.setWidth(30.11);
//         cloud21.setEffect(cloud21Shadow);
        
//         Ellipse cloud22 = new Ellipse();
//         DropShadow cloud22Shadow = new DropShadow();
//         cloud22.setFill(Color.WHITE);
//         cloud22.setLayoutX(223.0);
//         cloud22.setLayoutY(618.0);
//         cloud22.setRadiusX(61.0);
//         cloud22.setRadiusY(66.0);
//         cloud22.setRotate(-153.4);
//         cloud22.setStrokeWidth(0.0);
//         cloud22Shadow.setColor(Color.WHITE);
//         cloud22Shadow.setHeight(48.32);
//         cloud22Shadow.setRadius(19.1075);
//         cloud22Shadow.setSpread(0.4);
//         cloud22Shadow.setWidth(30.11);
//         cloud22.setEffect(cloud22Shadow);
        
//         Ellipse cloud23 = new Ellipse();
//         cloud23.setFill(Color.valueOf("#e0dbda"));
//         cloud23.setLayoutX(-6.0);
//         cloud23.setLayoutY(641.0);
//         cloud23.setRadiusX(105.0);
//         cloud23.setRadiusY(90.0);
//         cloud23.setStrokeWidth(0.0);
        
//          Ellipse cloud24 = new Ellipse();
//         cloud24.setFill(Color.valueOf("#e0dbda"));
//         cloud24.setLayoutX(-7.0);
//         cloud24.setLayoutY(536.0);
//         cloud24.setRadiusX(30.0);
//         cloud24.setRadiusY(31.0);
//         cloud24.setStrokeWidth(0.0);

//         Ellipse cloud25 = new Ellipse();
//         cloud25.setFill(Color.valueOf("#e0dbda"));
//         cloud25.setLayoutX(99.0);
//         cloud25.setLayoutY(599.0);
//         cloud25.setRadiusX(30.0);
//         cloud25.setRadiusY(31.0);
//         cloud25.setStrokeWidth(0.0);
        
//         Ellipse cloud26 = new Ellipse();
//         cloud26.setFill(Color.valueOf("#e0dbda"));
//         cloud26.setLayoutX(123.0);
//         cloud26.setLayoutY(632.0);
//         cloud26.setRadiusX(35.0);
//         cloud26.setRadiusY(42.0);
//         cloud26.setStrokeWidth(0.0);
        
//         Ellipse cloud27 = new Ellipse();
//         cloud27.setFill(Color.valueOf("#e0dbda"));
//         cloud27.setLayoutX(179.0);
//         cloud27.setLayoutY(655.0);
//         cloud27.setRadiusX(42.0);
//         cloud27.setRadiusY(35.0);
//         cloud27.setRotate(47.1);
//         cloud27.setStrokeWidth(0.0);
        
//         Ellipse cloud28 = new Ellipse();
//         cloud28.setFill(Color.valueOf("#e0dbda"));
//         cloud28.setLayoutX(59.0);
//         cloud28.setLayoutY(559.0);
//         cloud28.setRadiusX(18.0);
//         cloud28.setRadiusY(17.0);
//         cloud28.setStrokeWidth(0.0);
        
//         Ellipse cloud29 = new Ellipse();
//         cloud29.setFill(Color.valueOf("#e0dbda"));
//         cloud29.setLayoutX(272.0);
//         cloud29.setLayoutY(609.0);
//         cloud29.setRadiusX(18.0);
//         cloud29.setRadiusY(17.0);
//         cloud29.setStrokeWidth(0.0);
        
//         Ellipse cloud30 = new Ellipse();
//         cloud30.setFill(Color.valueOf("#e0dbda"));
//         cloud30.setLayoutX(249.0);
//         cloud30.setLayoutY(651.0);
//         cloud30.setRadiusX(30.0);
//         cloud30.setRadiusY(31.0);
//         cloud30.setStrokeWidth(0.0);
        
//         Ellipse cloud31 = new Ellipse();
//         cloud31.setFill(Color.valueOf("#e0dbda"));
//         cloud31.setLayoutX(273.0);
//         cloud31.setLayoutY(626.0);
//         cloud31.setRadiusX(20.0);
//         cloud31.setRadiusY(17.0);
//         cloud31.setStrokeWidth(0.0);
        
//         Ellipse cloud32 = new Ellipse();
//         cloud32.setFill(Color.valueOf("#e0dbda"));
//         cloud32.setLayoutX(292.0);
//         cloud32.setLayoutY(615.0);
//         cloud32.setRadiusX(18.0);
//         cloud32.setRadiusY(17.0);
//         cloud32.setStrokeWidth(0.0);
        
//         Ellipse cloud33 = new Ellipse();
//         cloud33.setFill(Color.valueOf("#e0dbda"));
//         cloud33.setLayoutX(331.0);
//         cloud33.setLayoutY(646.0);
//         cloud33.setRadiusX(20.0);
//         cloud33.setRadiusY(17.0);
//         cloud33.setStrokeWidth(0.0);
        
//         Ellipse cloud34 = new Ellipse();
//         cloud34.setFill(Color.valueOf("#e0dbda"));
//         cloud34.setLayoutX(361.0);
//         cloud34.setLayoutY(621.0);
//         cloud34.setRadiusX(20.0);
//         cloud34.setRadiusY(17.0);
//         cloud34.setStrokeWidth(0.0);
        
//         Ellipse cloud35 = new Ellipse();
//         cloud35.setFill(Color.valueOf("#e0dbda"));
//         cloud35.setLayoutX(382.0);
//         cloud35.setLayoutY(630.0);
//         cloud35.setRadiusX(20.0);
//         cloud35.setRadiusY(17.0);
//         cloud35.setStrokeWidth(0.0);
        
//         Ellipse cloud36 = new Ellipse();
//         cloud36.setFill(Color.valueOf("#e0dbda"));
//         cloud36.setLayoutX(324.0);
//         cloud36.setLayoutY(615.0);
//         cloud36.setRadiusX(20.0);
//         cloud36.setRadiusY(17.0);
//         cloud36.setStrokeWidth(0.0);

//         Ellipse cloud37 = new Ellipse();    
//         cloud37.setFill(Color.valueOf("#e0dbda"));
//         cloud37.setLayoutX(305.0);
//         cloud37.setLayoutY(594.0);
//         cloud37.setRadiusX(14.0);
//         cloud37.setRadiusY(13.0);
//         cloud37.setStrokeWidth(0.0);
        
//         Ellipse cloud38 = new Ellipse();
//         cloud38.setFill(Color.valueOf("#e0dbda"));
//         cloud38.setLayoutX(646.0);
//         cloud38.setLayoutY(575.0);
//         cloud38.setRadiusX(20.0);
//         cloud38.setRadiusY(17.0);
//         cloud38.setStrokeWidth(0.0);
        
//         Ellipse cloud39 = new Ellipse();
//         cloud39.setFill(Color.valueOf("#e0dbda"));
//         cloud39.setLayoutX(543.0);
//         cloud39.setLayoutY(601.0);
//         cloud39.setRadiusX(20.0);
//         cloud39.setRadiusY(17.0);
//         cloud39.setStrokeWidth(0.0);
        
//         Ellipse cloud40 = new Ellipse();
//         cloud40.setFill(Color.valueOf("#e0dbda"));
//         cloud40.setLayoutX(425.0);
//         cloud40.setLayoutY(634.0);
//         cloud40.setRadiusX(40.0);
//         cloud40.setRadiusY(40.0);
//         cloud40.setStrokeWidth(0.0);
        
//         Ellipse cloud41 = new Ellipse();
//         cloud41.setFill(Color.valueOf("#e0dbda"));
//         cloud41.setLayoutX(449.0);
//         cloud41.setLayoutY(622.0);
//         cloud41.setRadiusX(18.0);
//         cloud41.setRadiusY(18.0);
//         cloud41.setStrokeWidth(0.0);
        
//         Ellipse cloud42 = new Ellipse();
//         cloud42.setFill(Color.valueOf("#e0dbda"));
//         cloud42.setLayoutX(392.0);
//         cloud42.setLayoutY(640.0);
//         cloud42.setRadiusX(20.0);
//         cloud42.setRadiusY(17.0);
//         cloud42.setStrokeWidth(0.0);
        
//         Ellipse cloud43 = new Ellipse();
//         cloud43.setFill(Color.valueOf("#e0dbda"));
//         cloud43.setLayoutX(609.0);
//         cloud43.setLayoutY(628.0);
//         cloud43.setRadiusX(81.0);
//         cloud43.setRadiusY(54.0);
//         cloud43.setRotate(-20.6);
//         cloud43.setStrokeWidth(0.0);

//         Ellipse cloud44 = new Ellipse();
//         cloud44.setFill(Color.valueOf("#e0dbda"));
//         cloud44.setLayoutX(514.0);
//         cloud44.setLayoutY(650.0);
//         cloud44.setRadiusX(81.0);
//         cloud44.setRadiusY(44.0);
//         cloud44.setRotate(-18.4);
//         cloud44.setStrokeWidth(0.0);

//         Ellipse cloud45 = new Ellipse();
//         cloud45.setFill(Color.valueOf("#e0dbda"));
//         cloud45.setLayoutX(532.0);
//         cloud45.setLayoutY(580.0);
//         cloud45.setRadiusX(14.0);
//         cloud45.setRadiusY(13.0);
//         cloud45.setStrokeWidth(0.0);
        
//         Ellipse cloud46 = new Ellipse();
//         cloud46.setFill(Color.valueOf("#e0dbda"));
//         cloud46.setLayoutX(316.0);
//         cloud46.setLayoutY(666.0);
//         cloud46.setRadiusX(81.0);
//         cloud46.setRadiusY(44.0);
//         cloud46.setStrokeWidth(0.0);

//         Ellipse cloud47 = new Ellipse();
//         cloud47.setFill(Color.valueOf("#e0dbda"));
//         cloud47.setLayoutX(370.0);
//         cloud47.setLayoutY(606.0);
//         cloud47.setRadiusX(10.0);
//         cloud47.setRadiusY(9.0);
//         cloud47.setStrokeWidth(0.0);
        
        
//         Ellipse cloud48 = new Ellipse();
//         cloud48.setFill(Color.valueOf("#e0dbda"));
//         cloud48.setLayoutX(476.0);
//         cloud48.setLayoutY(614.0);
//         cloud48.setRadiusX(10.0);
//         cloud48.setRadiusY(9.0);
//         cloud48.setStrokeWidth(0.0);
        
//         Ellipse cloud49 = new Ellipse();
//         cloud49.setFill(Color.valueOf("#e0dbda"));
//         cloud49.setLayoutX(579.0);
//         cloud49.setLayoutY(592.0);
//         cloud49.setRadiusX(15.0);
//         cloud49.setRadiusY(12.0);
//         cloud49.setStrokeWidth(0.0);
        
//         Ellipse cloud50 = new Ellipse();
//         cloud50.setFill(Color.valueOf("#e0dbda"));
//         cloud50.setLayoutX(626.0);
//         cloud50.setLayoutY(569.0);
//         cloud50.setRadiusX(10.0);
//         cloud50.setRadiusY(13.0);
//         cloud50.setStrokeWidth(0.0);
        
//         Ellipse cloud51 = new Ellipse();
//         cloud51.setFill(Color.valueOf("#e0dbda"));
//         cloud51.setLayoutX(178.0);
//         cloud51.setLayoutY(620.0);
//         cloud51.setRadiusX(10.0);
//         cloud51.setRadiusY(9.0);
//         cloud51.setStrokeWidth(0.0);
        
//         Ellipse cloud52 = new Ellipse();
//         cloud52.setFill(Color.valueOf("#e0dbda"));
//         cloud52.setLayoutX(209.0);
//         cloud52.setLayoutY(630.0);
//         cloud52.setRadiusX(10.0);
//         cloud52.setRadiusY(9.0);
//         cloud52.setStrokeWidth(0.0);
        
//         Ellipse cloud53 = new Ellipse();
//         cloud53.setFill(Color.valueOf("#e0dbda"));
//         cloud53.setLayoutX(129.0);
//         cloud53.setLayoutY(596.0);
//         cloud53.setRadiusX(10.0);
//         cloud53.setRadiusY(9.0);
//         cloud53.setStrokeWidth(0.0);
        
//         Ellipse cloud54 = new Ellipse();
//         cloud54.setFill(Color.valueOf("#e0dbda"));
//         cloud54.setLayoutX(69.0);
//         cloud54.setLayoutY(576.0);
//         cloud54.setRadiusX(10.0);
//         cloud54.setRadiusY(9.0);
//         cloud54.setStrokeWidth(0.0);
        
//         Ellipse cloud55 = new Ellipse();
//         cloud55.setFill(Color.valueOf("#e0dbda"));
//         cloud55.setLayoutX(31.0);
//         cloud55.setLayoutY(552.0);
//         cloud55.setRadiusX(10.0);
//         cloud55.setRadiusY(9.0);
//         cloud55.setStrokeWidth(0.0);
        
//         Ellipse cloud56  = new Ellipse();
//         cloud56.setFill(Color.valueOf("#e0dbda"));
//         cloud56.setLayoutX(21.0);
//         cloud56.setLayoutY(550.0);
//         cloud56.setRadiusX(10.0);
//         cloud56.setRadiusY(9.0);
//         cloud56.setStrokeWidth(0.0);
        
//         Ellipse cloud57 = new Ellipse();
//         cloud57.setFill(Color.valueOf("#e0dbda"));
//         cloud57.setLayoutX(154.0);
//         cloud57.setLayoutY(605.0);
//         cloud57.setRadiusX(6.0);
//         cloud57.setRadiusY(8.0);
//         cloud57.setStrokeWidth(0.0);
        
//         Ellipse cloud58 = new Ellipse();
//         cloud58.setFill(Color.valueOf("#e0dbda"));
//         cloud58.setLayoutX(431.0);
//         cloud58.setLayoutY(647.0);
//         cloud58.setRadiusX(27.0);
//         cloud58.setRadiusY(14.0);
//         cloud58.setStrokeWidth(0.0);
        
//         Ellipse cloud59 = new Ellipse();
//         cloud59.setFill(Color.valueOf("#e0dbda"));
//         cloud59.setLayoutX(472.0);
//         cloud59.setLayoutY(619.0);
//         cloud59.setRadiusX(10.0);
//         cloud59.setRadiusY(9.0);
//         cloud59.setStrokeWidth(0.0);

//         Ellipse cloud60 = new Ellipse();
//         cloud60.setFill(Color.valueOf("#e0dbda"));
//         cloud60.setLayoutX(504.0);
//         cloud60.setLayoutY(611.0);
//         cloud60.setRadiusX(18.0);
//         cloud60.setRadiusY(10.0);
//         cloud60.setStrokeWidth(0.0);
        
//         Ellipse cloud61 = new Ellipse();
//         cloud61.setFill(Color.valueOf("#e0dbda"));
//         cloud61.setLayoutX(516.0);
//         cloud61.setLayoutY(600.0);
//         cloud61.setRadiusX(10.0);
//         cloud61.setRadiusY(9.0);
//         cloud61.setStrokeWidth(0.0);
        
//         Ellipse cloud62 = new Ellipse();
//         cloud62.setFill(Color.valueOf("#e0dbda"));
//         cloud62.setLayoutX(562.0);
//         cloud62.setLayoutY(596.0);
//         cloud62.setRadiusX(10.0);
//         cloud62.setRadiusY(9.0);
//         cloud62.setStrokeWidth(0.0);
        
//         Ellipse cloud63 = new Ellipse();
//         cloud63.setFill(Color.valueOf("#e0dbda"));
//         cloud63.setLayoutX(41.0);
//         cloud63.setLayoutY(551.0);
//         cloud63.setRadiusX(10.0);
//         cloud63.setRadiusY(9.0);
//         cloud63.setStrokeWidth(0.0);
        
//         Ellipse cloud64 = new Ellipse();
//         cloud64.setFill(Color.valueOf("#e0dbda"));
//         cloud64.setLayoutX(612.0);
//         cloud64.setLayoutY(581.0);
//         cloud64.setRadiusX(14.0);
//         cloud64.setRadiusY(9.0);
//         cloud64.setStrokeWidth(0.0);
        
//         Ellipse cloud65 = new Ellipse();
//         cloud65.setFill(Color.valueOf("#e0dbda"));
//         cloud65.setLayoutX(232.0);
//         cloud65.setLayoutY(652.0);
//         cloud65.setRadiusX(10.0);
//         cloud65.setRadiusY(21.0);
//         cloud65.setStrokeWidth(0.0);

//         Ellipse cloud66 = new Ellipse();
//         cloud66.setFill(Color.valueOf("#e0dbda"));
//         cloud66.setLayoutX(219.0);
//         cloud66.setLayoutY(649.0);
//         cloud66.setRadiusX(18.0);
//         cloud66.setRadiusY(17.0);
//         cloud66.setStrokeWidth(0.0);
        
//         Ellipse cloud67 = new Ellipse();
//         cloud67.setFill(Color.WHITE);
//         cloud67.setLayoutX(385.0);
//         cloud67.setLayoutY(565.0);
//         cloud67.setRadiusX(14.0);
//         cloud67.setRadiusY(12.0);
//         cloud67.setStrokeWidth(0.0);
        
//         Ellipse cloud68 = new Ellipse();
//         DropShadow cloud68Shadow = new DropShadow();
//         cloud68.setFill(Color.WHITE);
//         cloud68.setLayoutX(230.0);
//         cloud68.setLayoutY(573.0);
//         cloud68.setRadiusX(24.0);
//         cloud68.setRadiusY(36.0);
//         cloud68.setStrokeWidth(0.0);
//         cloud68Shadow.setColor(Color.WHITE);
//         cloud68Shadow.setHeight(48.32);
//         cloud68Shadow.setRadius(19.1075);
//         cloud68Shadow.setSpread(0.4);
//         cloud68Shadow.setWidth(30.11);
//         cloud68.setEffect(cloud68Shadow);
        
//         Ellipse cloud69 = new Ellipse();
//         DropShadow cloud69Shadow = new DropShadow();
//         cloud69.setFill(Color.WHITE);
//         cloud69.setLayoutX(398.0);
//         cloud69.setLayoutY(553.0);
//         cloud69.setRadiusX(30.0);
//         cloud69.setRadiusY(35.0);
//         cloud69.setStrokeWidth(0.0);
//         cloud69Shadow.setColor(Color.WHITE);
//         cloud69Shadow.setHeight(48.32);
//         cloud69Shadow.setRadius(19.1075);
//         cloud69Shadow.setSpread(0.4);
//         cloud69Shadow.setWidth(30.11);
//         cloud69.setEffect(cloud69Shadow);
        
//         Ellipse cloud70 = new Ellipse();
//         DropShadow cloud70Shadow = new DropShadow();
//         cloud70.setFill(Color.WHITE);
//         cloud70.setLayoutX(273.0);
//         cloud70.setLayoutY(556.0);
//         cloud70.setRadiusX(30.0);
//         cloud70.setRadiusY(36.0);
//         cloud70.setStrokeWidth(0.0);
//         cloud70Shadow.setColor(Color.WHITE);
//         cloud70Shadow.setHeight(48.32);
//         cloud70Shadow.setRadius(19.1075);
//         cloud70Shadow.setSpread(0.4);
//         cloud70Shadow.setWidth(30.11);
//         cloud70.setEffect(cloud70Shadow);
        
//         /***************** STARS ****************************/
//         Circle star = new Circle();
//         star.setFill(Color.valueOf("#6b7685"));
//         star.setLayoutX(124.0);
//         star.setLayoutY(48.0);
//         star.setRadius(8.0);
        
//         Circle star1 = new Circle();
//         star1.setFill(Color.valueOf("#6b7685"));
//         star1.setLayoutX(23.0);
//         star1.setLayoutY(40.0);
//         star1.setRadius(6.0);
        
//         Circle star2 = new Circle();
//         star2.setFill(Color.valueOf("#6b7685"));
//         star2.setLayoutX(48.0);
//         star2.setLayoutY(125.0);
//         star2.setRadius(5.0);
        
//         Circle star3 = new Circle();
//         star3.setFill(Color.valueOf("#6b7685"));
//         star3.setLayoutX(506.0);
//         star3.setLayoutY(64.0);
//         star3.setRadius(8.0);
        
//         Circle star4 = new Circle();
//         star4.setFill(Color.valueOf("#6b7685"));
//         star4.setLayoutX(632.0);
//         star4.setLayoutY(128.0);
//         star4.setRadius(8.0);
        
//         Circle star5 = new Circle();
//         star5.setFill(Color.valueOf("#6b7685"));
//         star5.setLayoutX(248.0);
//         star5.setLayoutY(144.0);
//         star5.setRadius(8.0);
        
//         Circle star6 = new Circle();
//         star6.setFill(Color.valueOf("#6b7685"));
//         star6.setLayoutX(414.0);
//         star6.setLayoutY(56.0);
//         star6.setRadius(5.0);
        
//         Circle star7 = new Circle();
//         star7.setFill(Color.valueOf("#6b7685"));
//         star7.setLayoutX(42.0);
//         star7.setLayoutY(228.0);
//         star7.setRadius(4.0);
        
//         Circle star8 = new Circle();
//         star8.setFill(Color.valueOf("#6b7685"));
//         star8.setLayoutX(46.0);
//         star8.setLayoutY(356.0);
//         star8.setRadius(4.0);
        
//         Circle star9 = new Circle();
//         star9.setFill(Color.valueOf("#6b7685"));
//         star9.setLayoutX(121.0);
//         star9.setLayoutY(308.0);
//         star9.setRadius(4.0);
        
//         Circle star10 = new Circle();
//         star10.setFill(Color.valueOf("#6b7685"));
//         star10.setLayoutX(139.0);
//         star10.setLayoutY(291.0);
//         star10.setRadius(4.0);
        
//         Circle star11 = new Circle();
//         star11.setFill(Color.valueOf("#6b7685"));
//         star11.setLayoutX(199.0);
//         star11.setLayoutY(197.0);
//         star11.setRadius(4.0);
        
//         Circle star12 = new Circle();
//         star12.setFill(Color.valueOf("#6b7685"));
//         star12.setLayoutX(154.0);
//         star12.setLayoutY(152.0);
//         star12.setRadius(4.0);
        
//         Circle star13 = new Circle();
//         star13.setFill(Color.valueOf("#6b7685"));
//         star13.setLayoutX(428.0);
//         star13.setLayoutY(136.0);
//         star13.setRadius(4.0);
        
//         Circle star14 = new Circle();
//         star14.setFill(Color.valueOf("#6b7685"));
//         star14.setLayoutX(449.0);
//         star14.setLayoutY(152.0);
//         star14.setRadius(4.0);
        
//         Circle star15 = new Circle();
//         star15.setFill(Color.valueOf("#6b7685"));
//         star15.setLayoutX(532.0);
//         star15.setLayoutY(93.0);
//         star15.setRadius(4.0);

//         Circle star16 = new Circle();
//         star16.setFill(Color.valueOf("#6b7685"));
//         star16.setLayoutX(604.0);
//         star16.setLayoutY(34.0);
//         star16.setRadius(4.0);
        
//         Circle star17 = new Circle();
//         star17.setFill(Color.valueOf("#6b7685"));
//         star17.setLayoutX(543.0);
//         star17.setLayoutY(148.0);
//         star17.setRadius(4.0);
        
//         Circle star18 = new Circle();
//         star18.setFill(Color.valueOf("#6b7685"));
//         star18.setLayoutX(453.0);
//         star18.setLayoutY(22.0);
//         star18.setRadius(4.0);
        
//         Circle star19 = new Circle();
//         star19.setFill(Color.valueOf("#6b7685"));
//         star19.setLayoutX(170.0);
//         star19.setLayoutY(22.0);
//         star19.setRadius(4.0);
        
//         Circle star20 = new Circle();
//         star20.setFill(Color.valueOf("#6b7685"));
//         star20.setLayoutX(101.0);
//         star20.setLayoutY(197.0);
//         star20.setRadius(8.0);
        
//         /* Nose of the SIDES of the rocket */
//         Arc leftNoseLS = new Arc();
//         leftNoseLS.setFill(Color.valueOf("#ffe9d6"));
//         leftNoseLS.setLayoutX(248.0);
//         leftNoseLS.setLayoutY(247.0);
//         leftNoseLS.setLength(90.0);
//         leftNoseLS.setRadiusX(23.5);
//         leftNoseLS.setRadiusY(58.0);
//         leftNoseLS.setStartAngle(90.0);
//         leftNoseLS.setStrokeWidth(0.0);
//         leftNoseLS.setTranslateX(1.0);
//         leftNoseLS.setTranslateY(-1.0);
//         leftNoseLS.setType(ArcType.ROUND);

//         Arc rightNoseLS = new Arc();
//         rightNoseLS.setFill(Color.valueOf("#fcd4b8"));
//         rightNoseLS.setLayoutX(248.0);
//         rightNoseLS.setLayoutY(247.0);
//         rightNoseLS.setLength(90.0);
//         rightNoseLS.setRadiusX(23.5);
//         rightNoseLS.setRadiusY(58.0);
//         rightNoseLS.setStrokeWidth(0.0);
//         rightNoseLS.setTranslateY(-1.0);
//         rightNoseLS.setType(ArcType.ROUND);
        
//         Arc leftNoseRS = new Arc();
//         leftNoseRS.setFill(Color.valueOf("#ffe9d6"));
//         leftNoseRS.setLayoutX(258.0);
//         leftNoseRS.setLayoutY(257.0);
//         leftNoseRS.setLength(90.0);
//         leftNoseRS.setRadiusX(23.5);
//         leftNoseRS.setRadiusY(58.0);
//         leftNoseRS.setStartAngle(90.0);
//         leftNoseRS.setStrokeWidth(0.0);
//         leftNoseRS.setTranslateX(144.0);
//         leftNoseRS.setTranslateY(-11.0);
//         leftNoseRS.setType(ArcType.ROUND);
        
//         Arc rightNoseRS = new Arc();
//         rightNoseRS.setFill(Color.valueOf("#fcd4b8"));
//         rightNoseRS.setLayoutX(258.0);
//         rightNoseRS.setLayoutY(257.0);
//         rightNoseRS.setLength(90.0);
//         rightNoseRS.setRadiusX(23.5);
//         rightNoseRS.setRadiusY(58.0);
//         rightNoseRS.setStrokeWidth(0.0);
//         rightNoseRS.setTranslateX(144.0);
//         rightNoseRS.setTranslateY(-11.0);
//         rightNoseRS.setType(ArcType.ROUND);
        
//         /* Add Smoke (.gif) */
//         ImageView smoke = new ImageView();
//         smoke.setFitHeight(186.0);
//         smoke.setFitWidth(250.0);
//         smoke.setLayoutX(124.0);
//         smoke.setLayoutY(444.0);
//         smoke.setPickOnBounds(true);
//         smoke.setPreserveRatio(true);
//         smoke.setImage(new Image(getClass().getResource("images/smoke.gif").toExternalForm()));
        
//         ImageView smoke1 = new ImageView();
//         smoke1.setFitHeight(186.0);
//         smoke1.setFitWidth(250.0);
//         smoke1.setLayoutX(278.0);
//         smoke1.setLayoutY(444.0);
//         smoke1.setPickOnBounds(true);
//         smoke1.setPreserveRatio(true);
//         smoke1.setImage(new Image(getClass().getResource("images/smoke.gif").toExternalForm()));
        
//         /* copyright */
//         Label copyright = new Label();
//         copyright.setLayoutX(504.0);
//         copyright.setLayoutY(622.0);
//         copyright.setText("2018 © AAA Group");
//         copyright.setTextFill(javafx.scene.paint.Color.valueOf("#003380"));
//         copyright.setFont(new Font("Arial Bold", 15.0));

//         /* ADD ALL ELEMEMTS TO THE PANE */
//         pane.getChildren().add(planet);
//         pane.getChildren().add(galaxy);
//         pane.getChildren().add(blackHole);
//         pane.getChildren().addAll(rocketBodyLeft, rocketBodyRight);
//         pane.getChildren().addAll(insideLeftNoseCone, insideRightNoseCone);
//         pane.getChildren().addAll(turbineLL, turbineLR);
//         pane.getChildren().add(topLL);
//         pane.getChildren().add(middleLL);
//         pane.getChildren().add(bottomLR);
//         pane.getChildren().add(topLR);
//         pane.getChildren().add(middleLR);
//         pane.getChildren().add(bottomLL);
//         pane.getChildren().add(turbineRL);
//         pane.getChildren().add(turbineRR);
//         pane.getChildren().add(topRL);
//         pane.getChildren().add(middleRL);
//         pane.getChildren().add(bottomRL);
//         pane.getChildren().add(topRR);
//         pane.getChildren().add(middleRR);
//         pane.getChildren().add(bottomRR);
//         pane.getChildren().addAll(rightFing, leftFing);
//         pane.getChildren().addAll(rightFingSmall, leftFingSmall);
//         pane.getChildren().add(leftPartInside);
//         leftMotorSmall.getPoints().addAll(
//                 1.0, 10.0, 18.0, 10.0,
//                 21.0, 20.0, -2.0, 20.0);
//         pane.getChildren().add(leftMotorSmall);
//         leftMotorBig.getPoints().addAll(
//                 0.0, 10.0, 19.0, 10.0,
//                 22.0, 20.0, -3.0, 20.0);
//         pane.getChildren().add(leftMotorBig);
//         leftMotorShadow.getPoints().addAll(
//                 1.0, 15.0, 18.0, 15.0,
//                 21.0, 20.0, -2.0, 20.0 );
//         pane.getChildren().add(leftMotorShadow);
//         rightMotorSmall.getPoints().addAll(
//                 1.0, 10.0, 18.0, 10.0,
//                 21.0, 20.0, -2.0, 20.0);
//         pane.getChildren().add(rightMotorSmall);
//         rightMotorBig.getPoints().addAll(
//                 0.0, 10.0, 19.0, 10.0,
//                 22.0, 20.0, -3.0, 20.0 );
//         pane.getChildren().add(rightMotorBig);
//         rightMotorShadow.getPoints().addAll(
//                 1.0, 15.0, 18.0, 15.0,
//                 21.0, 20.0, -2.0, 20.0);
//         pane.getChildren().add(rightMotorShadow);
//         pane.getChildren().addAll(toInsideMotorL, toInsideMotorR);
//         pane.getChildren().add(rightInsideBody);
//         pane.getChildren().add(yellowBottom);
//         pane.getChildren().addAll(toInsideMotorSmallL, toInsideMotorSmallR);
//         leftSmallMotor.getPoints().addAll(
//                 0.0, 10.0, 19.0, 10.0,
//                 22.0, 20.0, -3.0, 20.0);
//         pane.getChildren().add(leftSmallMotor);
//         rightSmallMotor.getPoints().addAll(
//                 0.0, 10.0, 19.0, 10.0,
//                 22.0, 20.0, -3.0, 20.0 );
//         pane.getChildren().add(rightSmallMotor);
//         pane.getChildren().addAll(line, line0, line1, line2);
//         pane.getChildren().addAll(nasaLogo, usaFlag);
//         pane.getChildren().add(rocketWindow);
//         pane.getChildren().addAll(leftDivisorOfWindow, rightDivisorOfTheWindow);
//         pane.getChildren().addAll(leftBorderOfTheWindow, rightBorderOfTheWindow);
//         pane.getChildren().addAll(blackPartofTheMotorL, blackPartofTheMotorR);
//         pane.getChildren().addAll(borderLineL, borderLineR);
//         pane.getChildren().addAll(
//                 cloud,    cloud1,  cloud2,  cloud4,  cloud5,  cloud6,  cloud7,
//                 cloud8,   cloud9, cloud10, cloud11, cloud12, cloud13, cloud14,
//                 cloud15, cloud16, cloud17, cloud18, cloud19, cloud20, cloud21,
//                 cloud22, cloud23, cloud24, cloud25, cloud26, cloud27, cloud28,
//                 cloud29, cloud30, cloud31, cloud32, cloud33, cloud34, cloud35,
//                 cloud36, cloud37, cloud38, cloud39, cloud40, cloud41, cloud42,
//                 cloud43, cloud44, cloud45, cloud46, cloud47, cloud48, cloud49,
//                 cloud50, cloud51, cloud52, cloud53, cloud54, cloud55, cloud56,
//                 cloud57, cloud58, cloud59, cloud60, cloud61, cloud62, cloud63,
//                 cloud64, cloud65, cloud66, cloud67, cloud68, cloud69, cloud70
//         );
//         /* Polylines are the starts (type of cross) */
//         starWithCrossForm.getPoints().addAll(
//                 7.5, 0.0, 10.0, 0.0,
//                 10.0, 5.0, 17.5, 5.0,
//                 17.5, 7.5, 10.0, 7.5,
//                 10.0, 15.0, 7.5, 15.0,
//                 7.5, 7.5, 0.0, 7.5,
//                 0.0, 5.0, 7.5, 5.0,
//                 7.5, 0.0
//         );
//         pane.getChildren().add(starWithCrossForm);
//         starWithCrossForm1.getPoints().addAll(
//                 7.5, 0.0, 10.0, 0.0,
//                 10.0, 5.0, 17.5, 5.0,
//                 17.5, 7.5, 10.0, 7.5,
//                 10.0, 15.0, 7.5, 15.0,
//                 7.5, 7.5, 0.0, 7.5,
//                 0.0, 5.0, 7.5, 5.0,
//                 7.5, 0.0
//         );
//         pane.getChildren().add(starWithCrossForm1);
//         pane.getChildren().addAll(
//                 star,    star1,  star2,  star3,  star4,  star5,  star6,  star7,  star8, star9, star10, 
//                 star11, star12, star13, star14, star15, star16, star17, star18, star19, star20
//         );
//         pane.getChildren().addAll(leftNoseLS, rightNoseLS, leftNoseRS, rightNoseRS);
//         pane.getChildren().addAll(rightWRing, leftWRing);
//         pane.getChildren().addAll(rightNoseCone, leftNoseCone);
//         pane.getChildren().addAll(smoke, smoke1);
//         pane.getChildren().add(copyright);
        
//         /* Display the scene */
//         Scene scene = new Scene(pane, 650, 650);
//         primaryStage.setScene(scene);
//         primaryStage.setResizable(false);
//         primaryStage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }

// import javax.swing.JFrame;
// import javax.swing.JLabel;

// public class CreativeScene {

//     private static void createAndShowGUI() {
//         JFrame frame = new JFrame("Test");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(500, 500);
//         JLabel label = new JLabel("make it works");
//         frame.getContentPane().add(label);
//         frame.setVisible(true);
//     }

//     public static void main(String[] args) {
//         javax.swing.SwingUtilities.invokeLater(new Runnable() {
//             public void run() {
//                 createAndShowGUI();
//             }
//         });
//     }
// }


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class CreativeScene extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Scene scene = new Scene(new BorderPane(),400,400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

//     public static void main(String[] args) {
//         launch(args);
//     }
}