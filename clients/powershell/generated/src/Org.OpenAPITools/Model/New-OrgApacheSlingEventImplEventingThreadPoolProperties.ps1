function New-OrgApacheSlingEventImplEventingThreadPoolProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${minPoolSize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingEventImplEventingThreadPoolProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingEventImplEventingThreadPoolProperties -ArgumentList @(
            ${minPoolSize}
        )
    }
}
