# 프로젝트명

모의코인 투자 앱

## 기능

- 실시간 가상화폐 시세 확인: 애플리케이션을 실행하면 가상화폐의 실시간 시세를 확인할 수 있습니다.
- 가상화폐 상세 정보: 특정 가상화폐를 선택하면 해당 가상화폐의 상세 정보를 확인할 수 있습니다. 상세 정보에는 가격, 등락률 등이 포함됩니다.
- 관심 가상화폐 등록: 사용자는 관심 가상화폐를 등록할 수 있습니다. 등록한 가상화폐는 별도로 관리할 수 있습니다.
- 가상화폐 구매 기능: 관심 가상화폐 중 선택한 가상화폐를 구매할 수 있습니다.
- 그래프 표시: 가상화폐의 가격 변동을 그래프로 확인할 수 있습니다.

## 사용 기술 및 라이브러리

- Android Jetpack: ViewModel, LiveData, RecyclerView 등 Android Jetpack 라이브러리를 사용했습니다.
- Firebase Authentication: 사용자 인증을 위해 Firebase Authentication을 사용했습니다.
- Firebase Realtime Database: 가상화폐 데이터와 관심 가상화폐 정보를 저장하기 위해 Firebase Realtime Database를 사용했습니다.
- Retrofit: 서버와의 HTTP 통신을 위해 Retrofit 라이브러리를 사용했습니다.
- MPAndroidChart: 그래프 표시를 위해 MPAndroidChart 라이브러리를 사용했습니다.

## 설치 및 실행 방법

1. Android Studio를 설치합니다.
2. 이 저장소를 클론하거나 다운로드하여 Android Studio에서 프로젝트를 엽니다.
3. Firebase 프로젝트를 생성하고 Firebase Authentication 및 Firebase Realtime Database를 설정합니다.
4. Firebase 설정 파일(`google-services.json`)을 프로젝트에 추가합니다.
5. `MainActivity.kt` 파일에서 API 키를 설정합니다.
6. 애플리케이션을 빌드하고 실행합니다.
