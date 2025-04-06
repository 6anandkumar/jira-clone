const Navbar = () => {
    return (
      <nav className="w-full h-16 px-6 flex items-center justify-between border-b shadow-sm bg-white z-10">
        {/* Left: Logo */}
        <div className="text-xl font-bold text-indigo-600">
          TaskFlow
        </div>
  
        {/* Center: Create Button */}
        <div className="absolute left-1/2 transform -translate-x-1/2">
          <button className="bg-indigo-600 text-white px-4 py-2 rounded hover:bg-indigo-700 transition">
            + Create
          </button>
        </div>
  
        {/* Right: Avatar */}
        <div className="flex items-center space-x-2">
          <img
            src="https://i.pravatar.cc/150?img=8"
            alt="User"
            className="w-10 h-10 rounded-full border-2 border-indigo-500"
          />
        </div>
      </nav>
    );
  };
  
  export default Navbar;
  