
const BACKEND_URL = "http://localhost:8080"

const fetchData = async () => {
  const response = await fetch(`${BACKEND_URL}/sngt`)

  const data = await response.json()

  return data
}

export default async function Home() {
  const data = await fetchData();

  if (!data || !data.data) return 'khtk'

  return (
    <p>{data.data}</p>
  );
}
