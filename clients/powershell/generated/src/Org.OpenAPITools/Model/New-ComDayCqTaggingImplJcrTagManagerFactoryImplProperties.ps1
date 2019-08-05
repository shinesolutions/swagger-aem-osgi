function New-ComDayCqTaggingImplJcrTagManagerFactoryImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${validationPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqTaggingImplJcrTagManagerFactoryImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqTaggingImplJcrTagManagerFactoryImplProperties -ArgumentList @(
            ${validationPeriodenabled}
        )
    }
}
