function New-ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${formportalPeriodinterval}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties -ArgumentList @(
            ${formportalPeriodinterval}
        )
    }
}
