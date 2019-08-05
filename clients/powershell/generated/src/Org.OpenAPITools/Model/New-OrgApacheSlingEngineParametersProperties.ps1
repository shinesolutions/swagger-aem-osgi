function New-OrgApacheSlingEngineParametersProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPerioddefaultPeriodparameterPeriodencoding},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${slingPerioddefaultPeriodmaxPeriodparameters},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${filePeriodlocation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${filePeriodthreshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${filePeriodmax},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${requestPeriodmax},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${slingPerioddefaultPeriodparameterPeriodcheckForAdditionalContainerParameters}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingEngineParametersProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingEngineParametersProperties -ArgumentList @(
            ${slingPerioddefaultPeriodparameterPeriodencoding},
            ${slingPerioddefaultPeriodmaxPeriodparameters},
            ${filePeriodlocation},
            ${filePeriodthreshold},
            ${filePeriodmax},
            ${requestPeriodmax},
            ${slingPerioddefaultPeriodparameterPeriodcheckForAdditionalContainerParameters}
        )
    }
}
