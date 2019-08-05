function New-ComAdobeCqDtmImplServletsDTMDeployHookServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${dtmPeriodstagingPeriodipPeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${dtmPeriodproductionPeriodipPeriodwhitelist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDtmImplServletsDTMDeployHookServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDtmImplServletsDTMDeployHookServletProperties -ArgumentList @(
            ${dtmPeriodstagingPeriodipPeriodwhitelist},
            ${dtmPeriodproductionPeriodipPeriodwhitelist}
        )
    }
}
