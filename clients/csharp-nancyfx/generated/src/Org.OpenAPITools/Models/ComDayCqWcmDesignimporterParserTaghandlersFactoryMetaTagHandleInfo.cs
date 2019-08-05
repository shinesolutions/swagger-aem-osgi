using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo:  IEquatable<ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo>
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
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo()
        {
        }

        private ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo(string Pid, string Title, string Description, ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoBuilder</returns>
        public static ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoBuilder</returns>
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo left, ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo left, ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties _Properties;

            internal ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoBuilder Properties(ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo</returns>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo(
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