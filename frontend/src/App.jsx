import './index.css';
import AppRouter from './config/Router';
import Theme from './config/Theme/theme';

function App() {

  console.log("7")
  return (
    <Theme theme={false}>
      <div className='min-h-screen'>
        <AppRouter /> 
      </div>
    </Theme>
  )
}

export default App
