function New-ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties -ArgumentList @(
            ${hcPeriodtags}
        )
    }
}
