using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamCfmImplComponentComponentConfigImplInfo
    /// </summary>
    public sealed class ComAdobeCqDamCfmImplComponentComponentConfigImplInfo:  IEquatable<ComAdobeCqDamCfmImplComponentComponentConfigImplInfo>
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
        public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamCfmImplComponentComponentConfigImplInfo()
        {
        }

        private ComAdobeCqDamCfmImplComponentComponentConfigImplInfo(string Pid, string Title, string Description, ComAdobeCqDamCfmImplComponentComponentConfigImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplComponentComponentConfigImplInfoBuilder</returns>
        public static ComAdobeCqDamCfmImplComponentComponentConfigImplInfoBuilder Builder()
        {
            return new ComAdobeCqDamCfmImplComponentComponentConfigImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamCfmImplComponentComponentConfigImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplComponentComponentConfigImplInfoBuilder</returns>
        public ComAdobeCqDamCfmImplComponentComponentConfigImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamCfmImplComponentComponentConfigImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplComponentComponentConfigImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplComponentComponentConfigImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamCfmImplComponentComponentConfigImplInfo left, ComAdobeCqDamCfmImplComponentComponentConfigImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplComponentComponentConfigImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplComponentComponentConfigImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamCfmImplComponentComponentConfigImplInfo left, ComAdobeCqDamCfmImplComponentComponentConfigImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.
        /// </summary>
        public sealed class ComAdobeCqDamCfmImplComponentComponentConfigImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamCfmImplComponentComponentConfigImplProperties _Properties;

            internal ComAdobeCqDamCfmImplComponentComponentConfigImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamCfmImplComponentComponentConfigImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamCfmImplComponentComponentConfigImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamCfmImplComponentComponentConfigImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamCfmImplComponentComponentConfigImplInfoBuilder Properties(ComAdobeCqDamCfmImplComponentComponentConfigImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamCfmImplComponentComponentConfigImplInfo</returns>
            public ComAdobeCqDamCfmImplComponentComponentConfigImplInfo Build()
            {
                Validate();
                return new ComAdobeCqDamCfmImplComponentComponentConfigImplInfo(
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