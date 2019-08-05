function New-OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${javaPeriodclassdebuginfo},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${javaPeriodjavaEncoding},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${javaPeriodcompilerSourceVM},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${javaPeriodcompilerTargetVM}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties -ArgumentList @(
            ${javaPeriodclassdebuginfo},
            ${javaPeriodjavaEncoding},
            ${javaPeriodcompilerSourceVM},
            ${javaPeriodcompilerTargetVM}
        )
    }
}
