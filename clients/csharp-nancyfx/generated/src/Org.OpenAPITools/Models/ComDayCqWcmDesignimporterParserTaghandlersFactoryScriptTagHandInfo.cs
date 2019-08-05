using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo:  IEquatable<ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo>
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
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo()
        {
        }

        private ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo(string Pid, string Title, string Description, ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoBuilder</returns>
        public static ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoBuilder</returns>
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo left, ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo left, ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties _Properties;

            internal ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoBuilder Properties(ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo</returns>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo(
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