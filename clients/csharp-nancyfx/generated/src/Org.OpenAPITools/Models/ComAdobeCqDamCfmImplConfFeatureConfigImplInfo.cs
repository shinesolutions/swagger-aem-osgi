using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamCfmImplConfFeatureConfigImplInfo
    /// </summary>
    public sealed class ComAdobeCqDamCfmImplConfFeatureConfigImplInfo:  IEquatable<ComAdobeCqDamCfmImplConfFeatureConfigImplInfo>
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
        public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamCfmImplConfFeatureConfigImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamCfmImplConfFeatureConfigImplInfo()
        {
        }

        private ComAdobeCqDamCfmImplConfFeatureConfigImplInfo(string Pid, string Title, string Description, ComAdobeCqDamCfmImplConfFeatureConfigImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamCfmImplConfFeatureConfigImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplConfFeatureConfigImplInfoBuilder</returns>
        public static ComAdobeCqDamCfmImplConfFeatureConfigImplInfoBuilder Builder()
        {
            return new ComAdobeCqDamCfmImplConfFeatureConfigImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamCfmImplConfFeatureConfigImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplConfFeatureConfigImplInfoBuilder</returns>
        public ComAdobeCqDamCfmImplConfFeatureConfigImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamCfmImplConfFeatureConfigImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamCfmImplConfFeatureConfigImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplConfFeatureConfigImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplConfFeatureConfigImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamCfmImplConfFeatureConfigImplInfo left, ComAdobeCqDamCfmImplConfFeatureConfigImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamCfmImplConfFeatureConfigImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplConfFeatureConfigImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplConfFeatureConfigImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamCfmImplConfFeatureConfigImplInfo left, ComAdobeCqDamCfmImplConfFeatureConfigImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamCfmImplConfFeatureConfigImplInfo.
        /// </summary>
        public sealed class ComAdobeCqDamCfmImplConfFeatureConfigImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamCfmImplConfFeatureConfigImplProperties _Properties;

            internal ComAdobeCqDamCfmImplConfFeatureConfigImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplConfFeatureConfigImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamCfmImplConfFeatureConfigImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplConfFeatureConfigImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamCfmImplConfFeatureConfigImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplConfFeatureConfigImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamCfmImplConfFeatureConfigImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplConfFeatureConfigImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamCfmImplConfFeatureConfigImplInfoBuilder Properties(ComAdobeCqDamCfmImplConfFeatureConfigImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamCfmImplConfFeatureConfigImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamCfmImplConfFeatureConfigImplInfo</returns>
            public ComAdobeCqDamCfmImplConfFeatureConfigImplInfo Build()
            {
                Validate();
                return new ComAdobeCqDamCfmImplConfFeatureConfigImplInfo(
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