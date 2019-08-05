using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo:  IEquatable<ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo>
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
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo()
        {
        }

        private ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo(string Pid, string Title, string Description, ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoBuilder</returns>
        public static ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoBuilder</returns>
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo left, ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo left, ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties _Properties;

            internal ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoBuilder Properties(ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo</returns>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo(
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