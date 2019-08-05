function New-OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jasperPeriodcompilerTargetVM},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jasperPeriodcompilerSourceVM},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${jasperPeriodclassdebuginfo},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${jasperPeriodenablePooling},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jasperPeriodieClassId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${jasperPeriodgenStringAsCharArray},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${jasperPeriodkeepgenerated},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${jasperPeriodmappedfile},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${jasperPeriodtrimSpaces},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${jasperPerioddisplaySourceFragments},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${defaultPeriodisPeriodsession}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties -ArgumentList @(
            ${jasperPeriodcompilerTargetVM},
            ${jasperPeriodcompilerSourceVM},
            ${jasperPeriodclassdebuginfo},
            ${jasperPeriodenablePooling},
            ${jasperPeriodieClassId},
            ${jasperPeriodgenStringAsCharArray},
            ${jasperPeriodkeepgenerated},
            ${jasperPeriodmappedfile},
            ${jasperPeriodtrimSpaces},
            ${jasperPerioddisplaySourceFragments},
            ${defaultPeriodisPeriodsession}
        )
    }
}
