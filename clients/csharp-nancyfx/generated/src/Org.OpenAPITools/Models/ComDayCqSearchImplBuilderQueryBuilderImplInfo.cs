using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqSearchImplBuilderQueryBuilderImplInfo
    /// </summary>
    public sealed class ComDayCqSearchImplBuilderQueryBuilderImplInfo:  IEquatable<ComDayCqSearchImplBuilderQueryBuilderImplInfo>
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
        public ComDayCqSearchImplBuilderQueryBuilderImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqSearchImplBuilderQueryBuilderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqSearchImplBuilderQueryBuilderImplInfo()
        {
        }

        private ComDayCqSearchImplBuilderQueryBuilderImplInfo(string Pid, string Title, string Description, ComDayCqSearchImplBuilderQueryBuilderImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqSearchImplBuilderQueryBuilderImplInfo.
        /// </summary>
        /// <returns>ComDayCqSearchImplBuilderQueryBuilderImplInfoBuilder</returns>
        public static ComDayCqSearchImplBuilderQueryBuilderImplInfoBuilder Builder()
        {
            return new ComDayCqSearchImplBuilderQueryBuilderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqSearchImplBuilderQueryBuilderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqSearchImplBuilderQueryBuilderImplInfoBuilder</returns>
        public ComDayCqSearchImplBuilderQueryBuilderImplInfoBuilder With()
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

        public bool Equals(ComDayCqSearchImplBuilderQueryBuilderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqSearchImplBuilderQueryBuilderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchImplBuilderQueryBuilderImplInfo</param>
        /// <param name="right">Compared (ComDayCqSearchImplBuilderQueryBuilderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqSearchImplBuilderQueryBuilderImplInfo left, ComDayCqSearchImplBuilderQueryBuilderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqSearchImplBuilderQueryBuilderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchImplBuilderQueryBuilderImplInfo</param>
        /// <param name="right">Compared (ComDayCqSearchImplBuilderQueryBuilderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqSearchImplBuilderQueryBuilderImplInfo left, ComDayCqSearchImplBuilderQueryBuilderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqSearchImplBuilderQueryBuilderImplInfo.
        /// </summary>
        public sealed class ComDayCqSearchImplBuilderQueryBuilderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqSearchImplBuilderQueryBuilderImplProperties _Properties;

            internal ComDayCqSearchImplBuilderQueryBuilderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqSearchImplBuilderQueryBuilderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqSearchImplBuilderQueryBuilderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchImplBuilderQueryBuilderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqSearchImplBuilderQueryBuilderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchImplBuilderQueryBuilderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqSearchImplBuilderQueryBuilderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchImplBuilderQueryBuilderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqSearchImplBuilderQueryBuilderImplInfoBuilder Properties(ComDayCqSearchImplBuilderQueryBuilderImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqSearchImplBuilderQueryBuilderImplInfo.
            /// </summary>
            /// <returns>ComDayCqSearchImplBuilderQueryBuilderImplInfo</returns>
            public ComDayCqSearchImplBuilderQueryBuilderImplInfo Build()
            {
                Validate();
                return new ComDayCqSearchImplBuilderQueryBuilderImplInfo(
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