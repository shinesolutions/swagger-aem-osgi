function New-ComDayCqWcmFoundationFormsImplFormChooserServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${servicePeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodresourceTypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodselectors},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${slingPeriodservletPeriodmethods},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${formsPeriodformchooserservletPeriodadvansesearchPeriodrequire}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmFoundationFormsImplFormChooserServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmFoundationFormsImplFormChooserServletProperties -ArgumentList @(
            ${servicePeriodname},
            ${slingPeriodservletPeriodresourceTypes},
            ${slingPeriodservletPeriodselectors},
            ${slingPeriodservletPeriodmethods},
            ${formsPeriodformchooserservletPeriodadvansesearchPeriodrequire}
        )
    }
}
