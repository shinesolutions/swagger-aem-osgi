using FastEndpoints;
using FastEndpoints.Swagger;

var builder = WebApplication.CreateBuilder(args);

builder.Services
    
    .AddFastEndpoints()
    .SwaggerDocument(o =>
    {
        o.DocumentSettings = s =>
        {
            s.DocumentName = "Adobe Experience Manager OSGI config (AEM) API";
            s.Title = "Adobe Experience Manager OSGI config (AEM) API";
            s.Description = """
Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
""";
            s.Version = "1.0.0-pre.0";
        };
        o.AutoTagPathSegmentIndex = 0;
    })
    
;

var app = builder.Build();

app
    
    .UseFastEndpoints(x =>
    {
        
    })
    .UseSwaggerGen();

app.UseHttpsRedirection();

app.Run();