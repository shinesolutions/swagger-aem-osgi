using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo:  IEquatable<ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo>
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
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo()
        {
        }

        private ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo(string Pid, string Title, string Description, ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoBuilder</returns>
        public static ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoBuilder</returns>
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo left, ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo left, ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties _Properties;

            internal ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoBuilder Properties(ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo</returns>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo(
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