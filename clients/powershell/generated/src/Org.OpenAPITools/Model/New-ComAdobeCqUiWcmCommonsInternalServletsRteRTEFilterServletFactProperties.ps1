function New-ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${resourcePeriodtypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties -ArgumentList @(
            ${resourcePeriodtypes}
        )
    }
}
