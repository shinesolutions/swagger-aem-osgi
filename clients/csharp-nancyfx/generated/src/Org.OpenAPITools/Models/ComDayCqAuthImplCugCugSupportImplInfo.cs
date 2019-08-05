using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAuthImplCugCugSupportImplInfo
    /// </summary>
    public sealed class ComDayCqAuthImplCugCugSupportImplInfo:  IEquatable<ComDayCqAuthImplCugCugSupportImplInfo>
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
        public ComDayCqAuthImplCugCugSupportImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAuthImplCugCugSupportImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAuthImplCugCugSupportImplInfo()
        {
        }

        private ComDayCqAuthImplCugCugSupportImplInfo(string Pid, string Title, string Description, ComDayCqAuthImplCugCugSupportImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAuthImplCugCugSupportImplInfo.
        /// </summary>
        /// <returns>ComDayCqAuthImplCugCugSupportImplInfoBuilder</returns>
        public static ComDayCqAuthImplCugCugSupportImplInfoBuilder Builder()
        {
            return new ComDayCqAuthImplCugCugSupportImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAuthImplCugCugSupportImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAuthImplCugCugSupportImplInfoBuilder</returns>
        public ComDayCqAuthImplCugCugSupportImplInfoBuilder With()
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

        public bool Equals(ComDayCqAuthImplCugCugSupportImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAuthImplCugCugSupportImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAuthImplCugCugSupportImplInfo</param>
        /// <param name="right">Compared (ComDayCqAuthImplCugCugSupportImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAuthImplCugCugSupportImplInfo left, ComDayCqAuthImplCugCugSupportImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAuthImplCugCugSupportImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAuthImplCugCugSupportImplInfo</param>
        /// <param name="right">Compared (ComDayCqAuthImplCugCugSupportImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAuthImplCugCugSupportImplInfo left, ComDayCqAuthImplCugCugSupportImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAuthImplCugCugSupportImplInfo.
        /// </summary>
        public sealed class ComDayCqAuthImplCugCugSupportImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqAuthImplCugCugSupportImplProperties _Properties;

            internal ComDayCqAuthImplCugCugSupportImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplCugCugSupportImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqAuthImplCugCugSupportImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplCugCugSupportImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqAuthImplCugCugSupportImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplCugCugSupportImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqAuthImplCugCugSupportImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplCugCugSupportImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqAuthImplCugCugSupportImplInfoBuilder Properties(ComDayCqAuthImplCugCugSupportImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAuthImplCugCugSupportImplInfo.
            /// </summary>
            /// <returns>ComDayCqAuthImplCugCugSupportImplInfo</returns>
            public ComDayCqAuthImplCugCugSupportImplInfo Build()
            {
                Validate();
                return new ComDayCqAuthImplCugCugSupportImplInfo(
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