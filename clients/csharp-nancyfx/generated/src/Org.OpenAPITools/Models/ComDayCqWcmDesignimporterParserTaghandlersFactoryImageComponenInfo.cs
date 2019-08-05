using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo:  IEquatable<ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo>
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
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo()
        {
        }

        private ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo(string Pid, string Title, string Description, ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoBuilder</returns>
        public static ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoBuilder</returns>
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo left, ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo left, ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties _Properties;

            internal ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoBuilder Properties(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo</returns>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo(
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