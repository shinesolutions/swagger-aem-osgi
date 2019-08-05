function New-ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jmxPeriodobjectname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${propertyPeriodmeasurePeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${propertyPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${propertyPeriodmaxPeriodwaitPeriodms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyFloat]]
        ${propertyPeriodmaxPeriodrate},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${fulltextPeriodmeasurePeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${fulltextPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${fulltextPeriodmaxPeriodwaitPeriodms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyFloat]]
        ${fulltextPeriodmaxPeriodrate}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties -ArgumentList @(
            ${jmxPeriodobjectname},
            ${propertyPeriodmeasurePeriodenabled},
            ${propertyPeriodname},
            ${propertyPeriodmaxPeriodwaitPeriodms},
            ${propertyPeriodmaxPeriodrate},
            ${fulltextPeriodmeasurePeriodenabled},
            ${fulltextPeriodname},
            ${fulltextPeriodmaxPeriodwaitPeriodms},
            ${fulltextPeriodmaxPeriodrate}
        )
    }
}
