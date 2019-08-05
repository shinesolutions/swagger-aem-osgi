function New-OrgApacheSlingServletsPostImplSlingPostServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${servletPeriodpostPerioddateFormats},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${servletPeriodpostPeriodnodeNameHints},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servletPeriodpostPeriodnodeNameMaxLength},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${servletPeriodpostPeriodcheckinNewVersionableNodes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${servletPeriodpostPeriodautoCheckout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${servletPeriodpostPeriodautoCheckin},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${servletPeriodpostPeriodignorePattern}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingServletsPostImplSlingPostServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingServletsPostImplSlingPostServletProperties -ArgumentList @(
            ${servletPeriodpostPerioddateFormats},
            ${servletPeriodpostPeriodnodeNameHints},
            ${servletPeriodpostPeriodnodeNameMaxLength},
            ${servletPeriodpostPeriodcheckinNewVersionableNodes},
            ${servletPeriodpostPeriodautoCheckout},
            ${servletPeriodpostPeriodautoCheckin},
            ${servletPeriodpostPeriodignorePattern}
        )
    }
}
