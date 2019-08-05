using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletCompanionServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletCompanionServletInfo:  IEquatable<ComDayCqDamCoreImplServletCompanionServletInfo>
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
        public ComDayCqDamCoreImplServletCompanionServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletCompanionServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletCompanionServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletCompanionServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletCompanionServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletCompanionServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCompanionServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletCompanionServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletCompanionServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletCompanionServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCompanionServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletCompanionServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletCompanionServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletCompanionServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCompanionServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCompanionServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletCompanionServletInfo left, ComDayCqDamCoreImplServletCompanionServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletCompanionServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCompanionServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCompanionServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletCompanionServletInfo left, ComDayCqDamCoreImplServletCompanionServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletCompanionServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletCompanionServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletCompanionServletProperties _Properties;

            internal ComDayCqDamCoreImplServletCompanionServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCompanionServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletCompanionServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCompanionServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletCompanionServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCompanionServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletCompanionServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCompanionServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletCompanionServletInfoBuilder Properties(ComDayCqDamCoreImplServletCompanionServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletCompanionServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletCompanionServletInfo</returns>
            public ComDayCqDamCoreImplServletCompanionServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletCompanionServletInfo(
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