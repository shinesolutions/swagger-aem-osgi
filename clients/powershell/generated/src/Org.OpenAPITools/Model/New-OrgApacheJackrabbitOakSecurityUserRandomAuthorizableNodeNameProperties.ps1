function New-OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${length}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties -ArgumentList @(
            ${length}
        )
    }
}
