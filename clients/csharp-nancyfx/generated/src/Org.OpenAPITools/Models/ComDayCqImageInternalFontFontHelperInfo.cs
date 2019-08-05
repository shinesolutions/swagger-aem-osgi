using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqImageInternalFontFontHelperInfo
    /// </summary>
    public sealed class ComDayCqImageInternalFontFontHelperInfo:  IEquatable<ComDayCqImageInternalFontFontHelperInfo>
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
        public ComDayCqImageInternalFontFontHelperProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqImageInternalFontFontHelperInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqImageInternalFontFontHelperInfo()
        {
        }

        private ComDayCqImageInternalFontFontHelperInfo(string Pid, string Title, string Description, ComDayCqImageInternalFontFontHelperProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqImageInternalFontFontHelperInfo.
        /// </summary>
        /// <returns>ComDayCqImageInternalFontFontHelperInfoBuilder</returns>
        public static ComDayCqImageInternalFontFontHelperInfoBuilder Builder()
        {
            return new ComDayCqImageInternalFontFontHelperInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqImageInternalFontFontHelperInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqImageInternalFontFontHelperInfoBuilder</returns>
        public ComDayCqImageInternalFontFontHelperInfoBuilder With()
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

        public bool Equals(ComDayCqImageInternalFontFontHelperInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqImageInternalFontFontHelperInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqImageInternalFontFontHelperInfo</param>
        /// <param name="right">Compared (ComDayCqImageInternalFontFontHelperInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqImageInternalFontFontHelperInfo left, ComDayCqImageInternalFontFontHelperInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqImageInternalFontFontHelperInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqImageInternalFontFontHelperInfo</param>
        /// <param name="right">Compared (ComDayCqImageInternalFontFontHelperInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqImageInternalFontFontHelperInfo left, ComDayCqImageInternalFontFontHelperInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqImageInternalFontFontHelperInfo.
        /// </summary>
        public sealed class ComDayCqImageInternalFontFontHelperInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqImageInternalFontFontHelperProperties _Properties;

            internal ComDayCqImageInternalFontFontHelperInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqImageInternalFontFontHelperInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqImageInternalFontFontHelperInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqImageInternalFontFontHelperInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqImageInternalFontFontHelperInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqImageInternalFontFontHelperInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqImageInternalFontFontHelperInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqImageInternalFontFontHelperInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqImageInternalFontFontHelperInfoBuilder Properties(ComDayCqImageInternalFontFontHelperProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqImageInternalFontFontHelperInfo.
            /// </summary>
            /// <returns>ComDayCqImageInternalFontFontHelperInfo</returns>
            public ComDayCqImageInternalFontFontHelperInfo Build()
            {
                Validate();
                return new ComDayCqImageInternalFontFontHelperInfo(
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