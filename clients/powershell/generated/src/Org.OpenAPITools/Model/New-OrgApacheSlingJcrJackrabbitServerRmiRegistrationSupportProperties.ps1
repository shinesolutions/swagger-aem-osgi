function New-OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${port}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties -ArgumentList @(
            ${port}
        )
    }
}
