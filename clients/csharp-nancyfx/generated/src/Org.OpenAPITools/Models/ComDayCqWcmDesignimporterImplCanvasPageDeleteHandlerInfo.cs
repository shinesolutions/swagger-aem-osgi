using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo:  IEquatable<ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo>
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
        public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo()
        {
        }

        private ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo(string Pid, string Title, string Description, ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoBuilder</returns>
        public static ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoBuilder</returns>
        public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo left, ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo left, ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties _Properties;

            internal ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoBuilder Properties(ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo</returns>
            public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo(
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