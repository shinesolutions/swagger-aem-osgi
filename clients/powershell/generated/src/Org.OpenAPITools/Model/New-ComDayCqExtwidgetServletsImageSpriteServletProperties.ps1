function New-ComDayCqExtwidgetServletsImageSpriteServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxWidth},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxHeight}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqExtwidgetServletsImageSpriteServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqExtwidgetServletsImageSpriteServletProperties -ArgumentList @(
            ${maxWidth},
            ${maxHeight}
        )
    }
}
