function New-ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${webserverPeriodaddress}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties -ArgumentList @(
            ${hcPeriodtags},
            ${webserverPeriodaddress}
        )
    }
}
