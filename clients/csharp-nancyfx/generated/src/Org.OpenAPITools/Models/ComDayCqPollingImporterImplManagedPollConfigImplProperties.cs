using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqPollingImporterImplManagedPollConfigImplProperties
    /// </summary>
    public sealed class ComDayCqPollingImporterImplManagedPollConfigImplProperties:  IEquatable<ComDayCqPollingImporterImplManagedPollConfigImplProperties>
    { 
        /// <summary>
        /// Id
        /// </summary>
        public ConfigNodePropertyString Id { get; private set; }

        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// Reference
        /// </summary>
        public ConfigNodePropertyBoolean Reference { get; private set; }

        /// <summary>
        /// Interval
        /// </summary>
        public ConfigNodePropertyInteger Interval { get; private set; }

        /// <summary>
        /// Expression
        /// </summary>
        public ConfigNodePropertyString Expression { get; private set; }

        /// <summary>
        /// Source
        /// </summary>
        public ConfigNodePropertyString Source { get; private set; }

        /// <summary>
        /// Target
        /// </summary>
        public ConfigNodePropertyString Target { get; private set; }

        /// <summary>
        /// Login
        /// </summary>
        public ConfigNodePropertyString Login { get; private set; }

        /// <summary>
        /// Password
        /// </summary>
        public ConfigNodePropertyString Password { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqPollingImporterImplManagedPollConfigImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqPollingImporterImplManagedPollConfigImplProperties()
        {
        }

        private ComDayCqPollingImporterImplManagedPollConfigImplProperties(ConfigNodePropertyString Id, ConfigNodePropertyBoolean Enabled, ConfigNodePropertyBoolean Reference, ConfigNodePropertyInteger Interval, ConfigNodePropertyString Expression, ConfigNodePropertyString Source, ConfigNodePropertyString Target, ConfigNodePropertyString Login, ConfigNodePropertyString Password)
        {
            
            this.Id = Id;
            
            this.Enabled = Enabled;
            
            this.Reference = Reference;
            
            this.Interval = Interval;
            
            this.Expression = Expression;
            
            this.Source = Source;
            
            this.Target = Target;
            
            this.Login = Login;
            
            this.Password = Password;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqPollingImporterImplManagedPollConfigImplProperties.
        /// </summary>
        /// <returns>ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder</returns>
        public static ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder Builder()
        {
            return new ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder</returns>
        public ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder With()
        {
            return Builder()
                .Id(Id)
                .Enabled(Enabled)
                .Reference(Reference)
                .Interval(Interval)
                .Expression(Expression)
                .Source(Source)
                .Target(Target)
                .Login(Login)
                .Password(Password);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqPollingImporterImplManagedPollConfigImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqPollingImporterImplManagedPollConfigImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPollingImporterImplManagedPollConfigImplProperties</param>
        /// <param name="right">Compared (ComDayCqPollingImporterImplManagedPollConfigImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqPollingImporterImplManagedPollConfigImplProperties left, ComDayCqPollingImporterImplManagedPollConfigImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqPollingImporterImplManagedPollConfigImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPollingImporterImplManagedPollConfigImplProperties</param>
        /// <param name="right">Compared (ComDayCqPollingImporterImplManagedPollConfigImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqPollingImporterImplManagedPollConfigImplProperties left, ComDayCqPollingImporterImplManagedPollConfigImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqPollingImporterImplManagedPollConfigImplProperties.
        /// </summary>
        public sealed class ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder
        {
            private ConfigNodePropertyString _Id;
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyBoolean _Reference;
            private ConfigNodePropertyInteger _Interval;
            private ConfigNodePropertyString _Expression;
            private ConfigNodePropertyString _Source;
            private ConfigNodePropertyString _Target;
            private ConfigNodePropertyString _Login;
            private ConfigNodePropertyString _Password;

            internal ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplProperties.Id property.
            /// </summary>
            /// <param name="value">Id</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder Id(ConfigNodePropertyString value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplProperties.Reference property.
            /// </summary>
            /// <param name="value">Reference</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder Reference(ConfigNodePropertyBoolean value)
            {
                _Reference = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplProperties.Interval property.
            /// </summary>
            /// <param name="value">Interval</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder Interval(ConfigNodePropertyInteger value)
            {
                _Interval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplProperties.Expression property.
            /// </summary>
            /// <param name="value">Expression</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder Expression(ConfigNodePropertyString value)
            {
                _Expression = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplProperties.Source property.
            /// </summary>
            /// <param name="value">Source</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder Source(ConfigNodePropertyString value)
            {
                _Source = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplProperties.Target property.
            /// </summary>
            /// <param name="value">Target</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder Target(ConfigNodePropertyString value)
            {
                _Target = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplProperties.Login property.
            /// </summary>
            /// <param name="value">Login</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder Login(ConfigNodePropertyString value)
            {
                _Login = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollConfigImplProperties.Password property.
            /// </summary>
            /// <param name="value">Password</param>
            public ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder Password(ConfigNodePropertyString value)
            {
                _Password = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqPollingImporterImplManagedPollConfigImplProperties.
            /// </summary>
            /// <returns>ComDayCqPollingImporterImplManagedPollConfigImplProperties</returns>
            public ComDayCqPollingImporterImplManagedPollConfigImplProperties Build()
            {
                Validate();
                return new ComDayCqPollingImporterImplManagedPollConfigImplProperties(
                    Id: _Id,
                    Enabled: _Enabled,
                    Reference: _Reference,
                    Interval: _Interval,
                    Expression: _Expression,
                    Source: _Source,
                    Target: _Target,
                    Login: _Login,
                    Password: _Password
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}