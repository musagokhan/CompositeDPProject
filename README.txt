Bu proje ile Composite yapısal kalıbı anlatılmaktadır. 
Bunu kullanırkende:
A. Manager : iş akışının yürütüldüğü bloktur. Çalıştırma burada başlatılır.
B. ComponentShow : (I) interface'dir. diğer 2 blok (C & D) bu interfece i kullanır. 
C. LeafBullet	: Tekilliğin sağlandığı birimdir. Bu birim (D) birimi tarafıdnan çoklu olarak kullanılacak olan yapıdır.
D. CompositeLauncher	: Çoğulluğun sağlandığı yani yapı içinde alt yapının kullanıldığı biirmdir. (C) yapısı çoklu olarak burada kullanılır.
