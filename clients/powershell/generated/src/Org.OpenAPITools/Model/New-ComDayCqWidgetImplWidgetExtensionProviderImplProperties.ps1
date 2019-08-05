function New-ComDayCqWidgetImplWidgetExtensionProviderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${extendablePeriodwidgets},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${widgetextensionproviderPerioddebug}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWidgetImplWidgetExtensionProviderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWidgetImplWidgetExtensionProviderImplProperties -ArgumentList @(
            ${extendablePeriodwidgets},
            ${widgetextensionproviderPerioddebug}
        )
    }
}
