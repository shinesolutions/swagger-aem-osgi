function New-ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${scene7FlashTemplatesPeriodrti},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${scene7FlashTemplatesPeriodrsi},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${scene7FlashTemplatesPeriodrb},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${scene7FlashTemplatesPeriodrurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${scene7FlashTemplatePeriodurlFormatParameter}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties -ArgumentList @(
            ${scene7FlashTemplatesPeriodrti},
            ${scene7FlashTemplatesPeriodrsi},
            ${scene7FlashTemplatesPeriodrb},
            ${scene7FlashTemplatesPeriodrurl},
            ${scene7FlashTemplatePeriodurlFormatParameter}
        )
    }
}
