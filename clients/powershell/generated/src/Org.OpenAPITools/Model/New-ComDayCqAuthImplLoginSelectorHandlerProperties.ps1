function New-ComDayCqAuthImplLoginSelectorHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${path},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${authPeriodloginselectorPeriodmappings},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${authPeriodloginselectorPeriodchangepwPeriodmappings},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodloginselectorPerioddefaultloginpage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodloginselectorPerioddefaultchangepwpage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${authPeriodloginselectorPeriodhandle},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${authPeriodloginselectorPeriodhandlePeriodallPeriodextensions}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAuthImplLoginSelectorHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAuthImplLoginSelectorHandlerProperties -ArgumentList @(
            ${path},
            ${servicePeriodranking},
            ${authPeriodloginselectorPeriodmappings},
            ${authPeriodloginselectorPeriodchangepwPeriodmappings},
            ${authPeriodloginselectorPerioddefaultloginpage},
            ${authPeriodloginselectorPerioddefaultchangepwpage},
            ${authPeriodloginselectorPeriodhandle},
            ${authPeriodloginselectorPeriodhandlePeriodallPeriodextensions}
        )
    }
}
