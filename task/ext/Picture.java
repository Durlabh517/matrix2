����   4w
 j �	 K �
 G �
 G �	 K �
 G �	 K �
 G � �
 G �	 K �
 : � � �
  �
 : � �
 	 � �	 K � �
 G � � �
  � �
  � �
  �
  � �
 G � � �
 G � � �
 G � � �
 G � � �
 G � � �
 K � �
 : � � 
 :
 K
	
 ; �
 K �
 K

 ;
 ;
 ; �
 K


	
 H
 G
 K	 K
 G
 K 
 K!"
#$%
#&
#'(
 K)*
 +,
 K-.
 /0
 K12
 3
45	678
9:
 K;< CHARSET_NAME Ljava/lang/String; ConstantValue LOCALE Ljava/util/Locale; WHITESPACE_PATTERN Ljava/util/regex/Pattern; EMPTY_PATTERN EVERYTHING_PATTERN scanner Ljava/util/Scanner; $assertionsDisabled Z <init> ()V Code LineNumberTable LocalVariableTable this LStdIn; isEmpty ()Z StackMapTable hasNextLine hasNextChar result readLine ()Ljava/lang/String; line e "Ljava/util/NoSuchElementException; � readChar ()C ch readAll 
readString readInt ()I token "Ljava/util/InputMismatchException; � 
readDouble ()D 	readFloat ()F readLong ()J 	readShort ()S readByte ()B readBoolean readAllStrings ()[Ljava/lang/String; i I tokens [Ljava/lang/String; decapitokens readAllLines lines Ljava/util/ArrayList; LocalVariableTypeTable )Ljava/util/ArrayList<Ljava/lang/String;>;	 readAllInts ()[I fields vals [I � readAllLongs ()[J [J � readAllDoubles ()[D [D � resync 
setScanner (Ljava/util/Scanner;)V readInts 
Deprecated RuntimeVisibleAnnotations Ljava/lang/Deprecated; readDoubles readStrings main ([Ljava/lang/String;)V args s a b c D <clinit> 
SourceFile 
StdIn.java x y t u= � � � r q>? p q@ �  java/util/NoSuchElementExceptionA � v wB � java/lang/AssertionError >Internal (Std)In.readChar() error! Please contact the authors. xCDE Uattempts to read a 'char' value from standard input, but no more tokens are available xF   s q Wattempts to read a 'String' value from standard input, but no more tokens are availableG �  java/util/InputMismatchException java/lang/StringBuilder Lattempts to read an 'int' value from standard input, but the next token is "HI "J � Tattemps to read an 'int' value from standard input, but no more tokens are availableK � Nattempts to read a 'double' value from standard input, but the next token is " Wattempts to read a 'double' value from standard input, but no more tokens are availableL � Mattempts to read a 'float' value from standard input, but the next token is " \attempts to read a 'float' value from standard input, but there no more tokens are availableM � Lattempts to read a 'long' value from standard input, but the next token is " Uattempts to read a 'long' value from standard input, but no more tokens are availableN � Mattempts to read a 'short' value from standard input, but the next token is " Vattempts to read a 'short' value from standard input, but no more tokens are availableO � Lattempts to read a 'byte' value from standard input, but the next token is " Uattempts to read a 'byte' value from standard input, but no more tokens are available � � truePQ false 1RS 0 Oattempts to read a 'boolean' value from standard input, but the next token is " Xattempts to read a 'boolean' value from standard input, but no more tokens are available � �TUV java/lang/String java/util/ArrayList � �WSX �YZ � �[\]^_`abc java/util/Scanner java/io/BufferedInputStreamdef xg StdIn UTF-8 xh � � n oij � � � � Type a string: klC Your string was: mCm y Type an int:  � � Your int was: Hn Type a boolean:  � � Your boolean was: Ho Type a double:  � � Your double was: Hpqr �st o \p{javaWhitespace}+uv \A � y java/lang/Object hasNext useDelimiter .(Ljava/util/regex/Pattern;)Ljava/util/Scanner; nextLine next length (Ljava/lang/Object;)V charAt (I)C (Ljava/lang/String;)V nextInt append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString 
nextDouble 	nextFloat nextLong 	nextShort nextByte equalsIgnoreCase (Ljava/lang/String;)Z equals (Ljava/lang/Object;)Z java/util/regex/Pattern split -(Ljava/lang/CharSequence;)[Ljava/lang/String; add size toArray (([Ljava/lang/Object;)[Ljava/lang/Object; java/lang/Integer parseInt (Ljava/lang/String;)I java/lang/Long 	parseLong (Ljava/lang/String;)J java/lang/Double parseDouble (Ljava/lang/String;)D java/lang/System in Ljava/io/InputStream; (Ljava/io/InputStream;)V *(Ljava/io/InputStream;Ljava/lang/String;)V 	useLocale '(Ljava/util/Locale;)Ljava/util/Scanner; StdOut print println (I)Ljava/lang/StringBuilder; (Z)Ljava/lang/StringBuilder; (D)Ljava/lang/StringBuilder; java/lang/Class desiredAssertionStatus java/util/Locale US compile -(Ljava/lang/String;)Ljava/util/regex/Pattern; 1 K j     k l  m    L  n o    p q    r q    s q   
 t u   v w     x y  z   /     *� �    {       � |        } ~   	  �  z   2      � � � � �    {       � �    @ 	 � �  z         � � �    {       	 � �  z   S     � � � W� � ;� � � W�    {       
   |       � w   	 � �  z   w     � � K� LK*�     
 	  {      # ' 
% & ( |        � l     � �    � l   �    J ��  � 	 � �  z   �     D� � � W� � 
K� � *� � � Y� �� � � W*� �K� 	Y� �    8 9 	  {      3 
4 5 )7 38 9: :; |      ( � l   : 
 � �   �    � ) ��     � 	 � �  z   h     %� � � �� � � � 
K� � � W*�    {      H 	I K M #N |       � l   �     	 � �  z   X     � � 
�K� 	Y� �      	  {      Z \ ] |      
 � �   �    G � 	 � �  z   �     :� � �K� � 
L� Y� Y� � +� � � � �K� 	Y� �          / 	  {      k m n o /r 0s |         � l   ' � �   0 
 � �   �   
 G �g � 	 � �  z   �     :� �  �K� � 
L� Y� Y� !� +� � � � �K� 	Y"� �          / 	  {      � � � � /� 0� |         � l   ' � �   0 
 � �   �   
 G �g � 	 � �  z   �     :� � #�K� � 
L� Y� Y� $� +� � � � �K� 	Y%� �          / 	  {      � � � � /� 0� |         � l   ' � �   0 
 � �   �   
 G �g � 	 � �  z   �     :� � &�K� � 
L� Y� Y� '� +� � � � �K� 	Y(� �          / 	  {      � � � � /� 0� |         � l   ' � �   0 
 � �   �   
 G �g � 	 � �  z   �     :� � )�K� � 
L� Y� Y� *� +� � � � �K� 	Y+� �          / 	  {      � � � � /� 0� |         � l   ' � �   0 
 � �   �   
 G �g � 	 � �  z   �     :� � ,�K� � 
L� Y� Y� -� +� � � � �K� 	Y.� �          / 	  {      � � � � /� 0� |         � l   ' � �   0 
 � �   �   
 G �g � 	 � �  z   �     [� /K0*� 1� �2*� 1� �3*� 4� �5*� 4� �� Y� Y� 6� *� � � � �K� 	Y7� �     P 	   P 	  $ P 	 % / P 	 0 P P 	  {   "   � � � � %� 0� P� Q� |      L � l   Q 
 � �   �    �  �


�     � 	 � �  z   �     <� � 8� 9K*�� *2� � *�*�d� :L=*�d� +*`2S����+�    {   "   
 
   " , 4 : |      $  � �  
 2 � �   "  � �  �    �  B� 	 B�  	 � �  z        (� ;Y� <K� =� *� >� ?W���**� @� :� A� B�    {          |        � �   �        � �   �   	 �  � 	 � �  z   �     "� CK*��
L=*�� +*2� DO����+�    {      ( ) 	* + *  , |        � �    � �   	  � �  �    �  B ��  	 � �  z   �     "� CK*��L=*�� +*2� EP����+�    {      6 7 	8 9 8  : |        � �    � �   	  � �  �    �  B ��  	 � �  z   �     "� CK*��L=*�� +*2� FR����+�    {      D E 	F G F  H |        � �    � �   	  � �  �    �  B ��  
 � y  z   3      � GY� HY� I� JL� M� N�    {   
   W X 
 � �  z   A     *� � � O� PW�    {      [ \ ] |        t u   	 � �  z         � Q�    {      h �     �     �   	 � �  z         � R�    {      t �     �     �   	 � �  z         � C�    {      ~ �     �     �   	 � �  z       �S� T� /L� Y� U� +� � � V� WX� T� Y=� Y� Z� � [� � V� W\� T� ]>� Y� ^� � _� � V� W`� T� a9� Y� b� � c� � V� W�    {   F   � � 	� � "� '� +� A� D� I� M� c� f� k� p� �� �� |   4    � � �   	 � � l  + ` � �  M > � w  p  � �   � y  z   m      2K� d� � � � e� Of� g� � g� h� g� � i�    {       �  �  �  � & � .P 1Q �    @  �    �