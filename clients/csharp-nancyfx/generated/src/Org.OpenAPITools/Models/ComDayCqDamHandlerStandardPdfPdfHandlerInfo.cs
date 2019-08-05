using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamHandlerStandardPdfPdfHandlerInfo
    /// </summary>
    public sealed class ComDayCqDamHandlerStandardPdfPdfHandlerInfo:  IEquatable<ComDayCqDamHandlerStandardPdfPdfHandlerInfo>
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
        public ComDayCqDamHandlerStandardPdfPdfHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamHandlerStandardPdfPdfHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamHandlerStandardPdfPdfHandlerInfo()
        {
        }

        private ComDayCqDamHandlerStandardPdfPdfHandlerInfo(string Pid, string Title, string Description, ComDayCqDamHandlerStandardPdfPdfHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamHandlerStandardPdfPdfHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqDamHandlerStandardPdfPdfHandlerInfoBuilder</returns>
        public static ComDayCqDamHandlerStandardPdfPdfHandlerInfoBuilder Builder()
        {
            return new ComDayCqDamHandlerStandardPdfPdfHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamHandlerStandardPdfPdfHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerStandardPdfPdfHandlerInfoBuilder</returns>
        public ComDayCqDamHandlerStandardPdfPdfHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqDamHandlerStandardPdfPdfHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamHandlerStandardPdfPdfHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerStandardPdfPdfHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamHandlerStandardPdfPdfHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamHandlerStandardPdfPdfHandlerInfo left, ComDayCqDamHandlerStandardPdfPdfHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamHandlerStandardPdfPdfHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerStandardPdfPdfHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamHandlerStandardPdfPdfHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamHandlerStandardPdfPdfHandlerInfo left, ComDayCqDamHandlerStandardPdfPdfHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamHandlerStandardPdfPdfHandlerInfo.
        /// </summary>
        public sealed class ComDayCqDamHandlerStandardPdfPdfHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamHandlerStandardPdfPdfHandlerProperties _Properties;

            internal ComDayCqDamHandlerStandardPdfPdfHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPdfPdfHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamHandlerStandardPdfPdfHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPdfPdfHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamHandlerStandardPdfPdfHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPdfPdfHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamHandlerStandardPdfPdfHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPdfPdfHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamHandlerStandardPdfPdfHandlerInfoBuilder Properties(ComDayCqDamHandlerStandardPdfPdfHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamHandlerStandardPdfPdfHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqDamHandlerStandardPdfPdfHandlerInfo</returns>
            public ComDayCqDamHandlerStandardPdfPdfHandlerInfo Build()
            {
                Validate();
                return new ComDayCqDamHandlerStandardPdfPdfHandlerInfo(
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