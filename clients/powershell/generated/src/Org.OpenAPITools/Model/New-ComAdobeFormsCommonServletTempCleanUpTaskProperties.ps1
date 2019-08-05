function New-ComAdobeFormsCommonServletTempCleanUpTaskProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${schedulerPeriodexpression},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${Duration for Temporary Storage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${Duration for Anonymous Storage}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeFormsCommonServletTempCleanUpTaskProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeFormsCommonServletTempCleanUpTaskProperties -ArgumentList @(
            ${schedulerPeriodexpression},
            ${Duration for Temporary Storage},
            ${Duration for Anonymous Storage}
        )
    }
}
