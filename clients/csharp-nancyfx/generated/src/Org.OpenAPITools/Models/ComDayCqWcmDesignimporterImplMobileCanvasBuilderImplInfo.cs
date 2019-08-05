using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo:  IEquatable<ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo()
        {
        }

        private ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo(string Pid, string Title, string Description, ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoBuilder</returns>
        public static ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoBuilder</returns>
        public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo left, ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo left, ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties _Properties;

            internal ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoBuilder Properties(ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo</returns>
            public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}