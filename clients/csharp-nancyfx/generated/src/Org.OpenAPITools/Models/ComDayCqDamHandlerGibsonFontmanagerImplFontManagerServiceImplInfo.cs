using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo
    /// </summary>
    public sealed class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo:  IEquatable<ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo>
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
        public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo()
        {
        }

        private ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo(string Pid, string Title, string Description, ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoBuilder</returns>
        public static ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoBuilder Builder()
        {
            return new ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoBuilder</returns>
        public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo left, ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo left, ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties _Properties;

            internal ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoBuilder Properties(ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo</returns>
            public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo(
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